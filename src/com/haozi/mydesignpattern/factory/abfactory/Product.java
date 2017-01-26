package com.haozi.mydesignpattern.factory.abfactory;

/**
 * @className:com.haozi.mydesignpattern.factory.abfactory.Product
 * @description:抽象产品类
 * @version:v1.0.0
 * @date:2017年1月25日 下午2:44:41
 * @author:WangHao
 */
public abstract class Product
{
	// 产品类的公共方法
	public void method1()
	{
		System.out.println("产品类的公共方法");
	}

	// 抽象方法，留待子类去实现
	public abstract void method2();
}
