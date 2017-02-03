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
		this.subject = new RealSubject();
	}

	// 通过构造函数传递代理者
	public Proxy(Object... objects)
	{
		this.subject = (Subject) objects[0];
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
		System.out.println("预处理，在被代理者真实方法前执行");
	}

	// 善后处理
	private void after()
	{
		System.out.println("善后处理，在被代理者真实方法后执行");
	}
}
