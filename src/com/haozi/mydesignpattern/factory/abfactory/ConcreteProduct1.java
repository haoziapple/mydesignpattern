package com.haozi.mydesignpattern.factory.abfactory;

/**
 * @className:com.haozi.mydesignpattern.factory.abfactory.ConcreteProduct1
 * @description:具体产品类1
 * @version:v1.0.0
 * @date:2017年1月25日 下午2:47:35
 * @author:WangHao
 */
public class ConcreteProduct1 extends Product
{
	// 具体产品类1的业务处理
	@Override
	public void method2()
	{
		System.out.println("具体产品类1的业务处理");
	}

}
