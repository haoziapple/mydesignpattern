package com.haozi.mydesignpattern.proxy.dproxy;

/**
 * @className:com.haozi.mydesignpattern.proxy.dproxy.BeforeAdvice
 * @description:通知接口的实现
 * @version:v1.0.0
 * @date:2017年2月4日 上午10:24:06
 * @author:WangHao
 */
public class BeforeAdvice implements IAdvice
{
	@Override
	public void exec()
	{
		System.out.println("我是前置通知，我被执行了!");
	}
}
