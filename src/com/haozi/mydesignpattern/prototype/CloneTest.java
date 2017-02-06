package com.haozi.mydesignpattern.prototype;

/**
 * @className:com.haozi.mydesignpattern.prototype.CloneTest
 * @description:测试对象Clone
 * @version:v1.0.0
 * @date:2016年11月22日 上午11:04:02
 * @author:WangHao
 */
public class CloneTest
{
	// 浅克隆
	public class ObjectA implements Cloneable
	{
		public String name;

		@Override
		public Object clone()
		{
			ObjectA o = null;
			try
			{
				// 调用super.clone()
				o = (ObjectA) super.clone();
			}
			catch (CloneNotSupportedException e)
			{
				e.printStackTrace();
			}
			return o;
		}
	}

	// 原型模式就是通过拷贝原型创建新的对象，而不是使用new方法
	public static void main(String[] args)
	{
		ObjectA a = new CloneTest().new ObjectA();

		ObjectA a2 = (ObjectA) a.clone();

		a.name = "1";

		System.out.println(a.name);
		System.out.println(a2.name);
	}
}
