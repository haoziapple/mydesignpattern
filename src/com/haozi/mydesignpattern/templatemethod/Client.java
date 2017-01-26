package com.haozi.mydesignpattern.templatemethod;

/**
 * @className:com.haozi.mydesignpattern.templatemethod.Client
 * @description:客户端调用场景
 * @version:v1.0.0
 * @date:2017年1月25日 下午3:30:29
 * @author:WangHao
 */
public class Client
{
	public static void main(String[] args)
	{
		AbstractClass class1 = new ConcreteClass1();

		// 调用模板方法
		class1.templateMethod();
	}
}
