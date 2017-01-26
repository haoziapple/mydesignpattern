package com.haozi.mydesignpattern;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @className:com.haozi.mydesignpattern.TestMessageFormat
 * @description:测试MessageFormat用法
 * @version:v1.0.0
 * @date:2017年1月24日 下午4:17:37
 * @author:WangHao
 */
public class TestMessageFormat
{
	// quartz源码里使用的sql语句
	public static void testQuartzSelect()
	{
		String SELECT_JOB_EXISTENCE = "SELECT JOB_NAME FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?";
		String result = MessageFormat.format(SELECT_JOB_EXISTENCE, new Object[] { "QRTZ_", "scheduler" });
		System.out.println(result);
	}

	// 测试使用不同的类型拼接消息
	public static void testMsgTypes()
	{
		Object[] arguments = { new Integer(7), new Date(System.currentTimeMillis()), "a disturbance in the Force" };

		String result = MessageFormat.format("At {1,time} on {1,date}, there was {2} on planet {0,number,integer}.",
				arguments);
		System.out.println(result);
	}

	public static void testMsgDate()
	{
		String result = MessageFormat.format("Today is {0}", new Date());
		System.out.println(result);

		System.out.println(MessageFormat.format("My age is {0},I was borm at {1}.", 26, 1979));
	}

	public static void main(String[] args)
	{
		testMsgDate();
	}
}
