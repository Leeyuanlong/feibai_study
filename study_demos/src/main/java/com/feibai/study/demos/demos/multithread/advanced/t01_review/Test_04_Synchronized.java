
package com.feibai.study.demos.demos.multithread.advanced.t01_review;

/**
 * synchronized关键字
 * 
 * 同步方法 - 同步方法和非同步方法的调用
 * 
 * 同步方法只影响锁定同一个锁对象的同步方法。不影响其他线程调用非同步方法，或调用其他锁资源的同步方法。
 */
public class Test_04_Synchronized {
	Object o = new Object();

	public synchronized void m1() { // 重量级的访问操作。
		System.out.println("public synchronized void m1() start");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("public synchronized void m1() end");
	}

	public void m3() {
		synchronized (o) {
			System.out.println("public void m3() start");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("public void m3() end");
		}
	}

	public void m2() {
		System.out.println("public void m2() start");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("public void m2() end");
	}

	public static class MyThread01 implements Runnable {
		public MyThread01(int i, Test_04_Synchronized t) {
			this.i = i;
			this.t = t;
		}

		int i;
		Test_04_Synchronized t;

		public void run() {
			if (i == 0) {
				t.m1();
			} else if (i > 0) {
				t.m2();
			} else {
				t.m3();
			}
		}
	}

	public static void main(String[] args) {
		Test_04_Synchronized t = new Test_04_Synchronized();
		new Thread(new Test_04_Synchronized.MyThread01(0, t)).start();
		new Thread(new Test_04_Synchronized.MyThread01(1, t)).start();
		new Thread(new Test_04_Synchronized.MyThread01(-1, t)).start();
	}

}