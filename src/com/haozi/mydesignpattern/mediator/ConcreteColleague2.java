package com.haozi.mydesignpattern.mediator;

/**
 * @className:com.haozi.mydesignpattern.mediator.ConcreteColleague2
 * @description:具体同事类2
 * @version:v1.0.0
 * @date:2017年2月6日 下午1:40:01
 * @author:WangHao
 */
public class ConcreteColleague2 extends Colleague
{

	public ConcreteColleague2(Mediator _mediator)
	{
		super(_mediator);
	}

	// 自有方法 self-method
	public void selfMethod2()
	{
		// 处理自己的业务逻辑
		System.out.println("自有方法selfMethod2，不依赖与中介者");
	}

	// 依赖方法 dep-method
	public void depMethod2()
	{
		// 处理自己的业务逻辑

		// 自己不能处理的业务逻辑，委托给中介者处理
		super.mediator.doSomething2();
	}

}
