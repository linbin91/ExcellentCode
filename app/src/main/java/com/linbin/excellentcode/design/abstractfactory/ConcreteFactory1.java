package com.linbin.excellentcode.design.abstractfactory;

/**
 * Created by yl1445 on 2017/7/10.
 */

public class ConcreteFactory1 extends AbstractFactory {
	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}
}
