package com.haozi.mydesignpattern.proxy.dproxy;

import java.lang.reflect.InvocationHandler;

import com.haozi.mydesignpattern.proxy.RealSubject;
import com.haozi.mydesignpattern.proxy.Subject;

/**
 * @className:com.haozi.mydesignpattern.proxy.dproxy.Client
 * @description:动态代理的场景类
 * @version:v1.0.0
 * @date:2017年2月4日 上午10:27:57
 * @author:WangHao
 */
public class Client
{
	public static void main(String[] args)
	{
		// 定义一个主题
		Subject subject = new RealSubject();
		// 定义一个Handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		// 定义主题的代理
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
				subject.getClass().getInterfaces(), handler);
		// 代理的行为
		proxy.request();
	}
}
