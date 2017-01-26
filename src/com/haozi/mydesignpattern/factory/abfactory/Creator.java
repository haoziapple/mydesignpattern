package com.haozi.mydesignpattern.factory.abfactory;

/**
 * @className:com.haozi.mydesignpattern.factory.abfactory.Creator
 * @description:抽象工厂类
 * @version:v1.0.0
 * @date:2017年1月25日 下午2:51:49
 * @author:WangHao
 */
public abstract class Creator
{

	/**
	 * @Description:根据参数创建相应的产品，参数也可以是String,Enum
	 * @param c
	 * @return
	 * @version:v1.0
	 * @author:WangHao
	 * @date:2017年1月25日 下午2:52:57
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
}
