package com.my.study.workspace.service;

import java.util.concurrent.Semaphore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.my.study.workspace.utils.ThreadPool;

public class ThreadPoolWithSemaphore {

	private static final Logger LOGGER = LoggerFactory.getLogger(ThreadPoolWithSemaphore.class);

	public void start() {
		final int paralleTaskCount = 10;// 设置信号量
		final Semaphore semaphore = new Semaphore(paralleTaskCount);
		ThreadPool.INSTANCE.submit(() -> {
			while (true) {
				final String task = "TaskId";
				acquireSemaphore(semaphore);
				Runnable process = () -> {
					doTask(task);
					semaphore.release();
				};
				ThreadPool.INSTANCE.submit(process);
			}
		});
	}

	private void acquireSemaphore(Semaphore semaphore) {
		try {
			semaphore.acquire();

		} catch (Exception e) {
			LOGGER.error("acquire semaphore fail.");
		}
	}

	private void doTask(String taskId) {
		// doSomething;
	}

}