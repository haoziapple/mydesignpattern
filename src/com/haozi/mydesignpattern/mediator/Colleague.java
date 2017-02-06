package com.haozi.mydesignpattern.mediator;

/**
 * @className:com.haozi.mydesignpattern.mediator.Colleague
 * @description:抽象同事类
 * @version:v1.0.0
 * @date:2017年2月6日 下午1:05:42
 * @author:WangHao
 */
public abstract class Colleague
{
	protected Mediator mediator;

	public Colleague(Mediator _mediator)
	{
		this.mediator = _mediator;
	}
}
