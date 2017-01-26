package com.haozi.mydesignpattern.factory.abfactory;

/**
 * @className:com.haozi.mydesignpattern.factory.abfactory.ConcreteCreator
 * @description:具体的工厂类
 * @version:v1.0.0
 * @date:2017年1月25日 下午2:51:24
 * @author:WangHao
 */
public class ConcreteCreator extends Creator
{

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> c)
	{
		Product product = null;
		try
		{
			product = (Product) Class.forName(c.getName()).newInstance();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return (T) product;
	}

}
