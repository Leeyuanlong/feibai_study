package com.feibai.study.demos.designpatterns.factorypatern;

import com.feibai.study.demos.designpatterns.factorypatern.bean.Car;
import com.feibai.study.demos.designpatterns.factorypatern.factorymethod.AudiFactory;
import com.feibai.study.demos.designpatterns.factorypatern.factorymethod.BenziFactory;
import com.feibai.study.demos.designpatterns.factorypatern.factorymethod.BydFactory;

/**
 * 工厂方法模式：会造成类的膨胀
 * 优点：符合开闭原则，新增产品无需修改原有代码。 实践中，简单工厂模式优先使用
 * 
 * @author leeyuanlong
 *
 */
public class FactoryMethodClient {

	Car audiCar = new AudiFactory().createCar();

	Car bydCar = new BydFactory().createCar();

	Car benziCar = new BenziFactory().createCar();
}