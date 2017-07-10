package com.linbin.excellentcode.design.factory;

/**
 * Created by yl1445 on 2017/7/10.
 */

public class ConcreteFactory extends Factory {

	@Override
	public <T extends Product> T createProduct(Class<T> clz) {
		Product product = null;
		try {
			product = (Product) Class.forName(clz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) product;
	}
}
