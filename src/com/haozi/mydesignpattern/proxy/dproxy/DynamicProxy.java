package com.haozi.mydesignpattern.proxy.dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @className:com.haozi.mydesignpattern.proxy.dproxy.DynamicProxy
 * @description:动态代理类
 * @version:v1.0.0
 * @date:2017年1月26日 上午10:37:10
 * @author:WangHao
 */
public class DynamicProxy<T>
{
	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
	{
		// 寻找JointPoint连接点,AOP框架使用元数据定义
		if (true)
		{
			// 执行一个前置通知
			new BeforeAdvice().exec();
		}

		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}
}
