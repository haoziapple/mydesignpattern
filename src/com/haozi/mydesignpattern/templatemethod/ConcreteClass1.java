package com.haozi.mydesignpattern.templatemethod;

/**
 * @className:com.haozi.mydesignpattern.templatemethod.ConcreteClass1
 * @description:具体模板类
 * @version:v1.0.0
 * @date:2017年1月25日 下午3:29:17
 * @author:WangHao
 */
public class ConcreteClass1 extends AbstractClass
{
	// 步骤1方法的具体实现
	@Override
	protected void step1()
	{
		System.out.println("步骤1方法的具体实现");
	}

	// 步骤2方法的具体实现
	@Override
	protected void step2()
	{
		System.out.println("步骤2方法的具体实现");
	}

	@Override
	protected void step3()
	{
		System.out.println("步骤3方法的具体实现");
	}

	// 钩子方法，复写父类的钩子方法来改变父类的算法行为
	@Override
	protected boolean hookMethod()
	{
		return true;
	}

}
