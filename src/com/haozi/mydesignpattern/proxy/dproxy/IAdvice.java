package com.haozi.mydesignpattern.proxy.dproxy;

/**
 * @className:com.haozi.mydesignpattern.proxy.dproxy.IAdvice
 * @description:通知接口
 * @version:v1.0.0
 * @date:2017年2月4日 上午10:21:46
 * @author:WangHao
 */
public interface IAdvice
{
	// 通知只有一个方法，执行即可
	public void exec();
}
