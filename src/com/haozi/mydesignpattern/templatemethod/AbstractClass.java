package com.haozi.mydesignpattern.templatemethod;

/**
 * @className:com.haozi.mydesignpattern.templatemethod.AbstractClass
 * @description:抽象模板类
 * @version:v1.0.0
 * @date:2017年1月25日 下午3:20:38
 * @author:WangHao
 */
public abstract class AbstractClass
{
	/**
	 * 模板方法模式--定义一个算法的框架，具体步骤的细节实现延迟到子类中
	 */

	// 步骤1方法
	protected abstract void step1();

	// 步骤2方法
	protected abstract void step2();

	// 步骤3方法
	protected abstract void step3();

	// 模板方法
	final public void templateMethod()
	{
		// 通过调用基本方法，完成相关逻辑
		this.step1();
		this.step2();

		if (this.hookMethod())
			this.step3();
	}

	// 钩子方法，子类复写这个方法来改变父类算法的行为
	protected boolean hookMethod()
	{
		return true;
	}
}
