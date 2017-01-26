package com.haozi.mydesignpattern.proxy;

/**
 * @className:com.haozi.mydesignpattern.proxy.Proxy
 * @description:代理类
 * @version:v1.0.0
 * @date:2017年1月25日 下午4:27:53
 * @author:WangHao
 */
public class Proxy implements Subject
{
	// 要代理哪个实现类
	private Subject subject = null;

	// 默认被代理者
	public Proxy()
	{
		this.subject = new Proxy();
	}

	// 通过构造函数传递代理者
	public Proxy(Object... objects)
	{

	}

	@Override
	public void request()
	{
		this.before();
		this.subject.request();
		this.after();
	}

	// 预处理
	private void before()
	{
		// 类似于Spring AOP的实现
	}

	// 善后处理
	private void after()
	{

	}
}
