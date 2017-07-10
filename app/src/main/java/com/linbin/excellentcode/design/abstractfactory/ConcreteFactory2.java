package com.linbin.excellentcode.design.abstractfactory;

/**
 * Created by yl1445 on 2017/7/10.
 */

public class ConcreteFactory2 extends AbstractFactory {
	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB2();
	}
}
