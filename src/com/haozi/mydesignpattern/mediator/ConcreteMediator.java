package com.haozi.mydesignpattern.mediator;

/**
 * @className:com.haozi.mydesignpattern.mediator.ConcreteMediator
 * @description:具体中介者
 * @version:v1.0.0
 * @date:2017年2月6日 下午1:46:51
 * @author:WangHao
 */
public class ConcreteMediator extends Mediator
{
	// doSomething1和doSomething2都是比较复杂的业务逻辑
	// 实现依赖各个同事类来完成
	@Override
	public void doSomething1()
	{
		System.out.println("中介者方法doSomething1,先调用c1,再调用c2");
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

	@Override
	public void doSomething2()
	{
		System.out.println("中介者方法doSomething2,先调用c2,再调用c1");
		super.c2.selfMethod2();
		super.c1.selfMethod1();
	}

}
