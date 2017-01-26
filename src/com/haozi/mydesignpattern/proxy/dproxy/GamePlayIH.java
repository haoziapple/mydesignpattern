package com.haozi.mydesignpattern.proxy.dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @className:com.haozi.mydesignpattern.proxy.dproxy.GamePlayIH
 * @description:动态代理类
 * @version:v1.0.0
 * @date:2017年1月25日 下午5:24:44
 * @author:WangHao
 */
public class GamePlayIH implements InvocationHandler
{

	// 被代理者
	Class cls = null;
	// 被代理的实例
	Object obj = null;

	// 通过构造函数指定代理
	public GamePlayIH(Object _obj)
	{
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
