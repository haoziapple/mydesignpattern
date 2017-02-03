package com.haozi.mydesignpattern.proxy;

/**
 * @className:com.haozi.mydesignpattern.proxy.RealSubject
 * @description:真实主题类
 * @version:v1.0.0
 * @date:2017年1月25日 下午4:25:42
 * @author:WangHao
 */
public class RealSubject implements Subject
{
	// 实现方法
	@Override
	public void request()
	{
		System.out.println("真实主题的业务操作");
	}
}
