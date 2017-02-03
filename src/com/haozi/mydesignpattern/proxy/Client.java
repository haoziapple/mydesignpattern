package com.haozi.mydesignpattern.proxy;

/**
 * @className:com.haozi.mydesignpattern.proxy.Client
 * @description:一般的代理模式使用场景
 * @version:v1.0.0
 * @date:2017年1月26日 上午11:05:54
 * @author:WangHao
 */
public class Client
{
	public static void main(String[] args)
	{
		// 被代理者
		Subject s = new RealSubject();
		
		// 代理者
		Subject proxy = new Proxy(s);
		
		proxy.request();
	}
}
