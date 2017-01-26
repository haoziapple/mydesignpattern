package com.haozi.mydesignpattern.singleton;

/**
 * @className:com.haozi.mydesignpattern.singleton.Singleton
 * @description:一般性的单例模式代码
 * @version:v1.0.0
 * @date:2017年1月25日 下午2:34:58
 * @author:WangHao
 */
public class Singleton
{
	private static final Singleton singleton = new Singleton();

	// 将构造器声明为private
	private Singleton()
	{

	}

	public static Singleton getSingleton()
	{
		return singleton;
	}
}
