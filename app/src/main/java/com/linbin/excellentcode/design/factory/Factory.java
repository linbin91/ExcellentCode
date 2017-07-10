package com.linbin.excellentcode.design.factory;

/**
 * Created by yl1445 on 2017/7/10.
 */

public abstract class Factory {

	public abstract <T extends Product> T createProduct(Class<T> clz);
}
