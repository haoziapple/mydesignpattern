package com.haozi.mydesignpattern.proxy.dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @className:com.haozi.mydesignpattern.proxy.dproxy.MyInvocationHandler
 * @description:动态代理Handler类
 * @version:v1.0.0
 * @date:2017年1月25日 下午5:24:44
 * @author:WangHao
 */
public class MyInvocationHandler implements InvocationHandler
{
	// 被代理的实例
	private Object obj = null;

	// 通过构造函数指定代理
	public MyInvocationHandler(Object _obj)
	{
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		// 执行被代理的方法
		System.out.println("MyInvocationHandler执行被代理的方法");
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
