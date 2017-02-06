package com.haozi.mydesignpattern.mediator;

/**
 * @className:com.haozi.mydesignpattern.mediator.ConcreteColleague1
 * @description:具体同事类
 * @version:v1.0.0
 * @date:2017年2月6日 下午1:30:59
 * @author:WangHao
 */
public class ConcreteColleague1 extends Colleague
{
	// 通过构造函数传递中介者
	public ConcreteColleague1(Mediator _mediator)
	{
		super(_mediator);
	}

	// 自有方法 self-method
	public void selfMethod1()
	{
		// 处理自己的业务逻辑
		System.out.println("自有方法selfMethod1，不依赖与中介者");
	}

	// 依赖方法 dep-method
	public void depMethod1()
	{
		// 处理自己的业务逻辑

		// 自己不能处理的业务逻辑，委托给中介者处理
		super.mediator.doSomething1();
	}
}
