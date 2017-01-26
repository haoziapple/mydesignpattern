package com.haozi.mydesignpattern;

/**
 * @className:com.haozi.mydesignpattern.TestIntEqual
 * @description:测试int==
 * @version:v1.0.0
 * @date:2017年1月25日 下午1:46:21
 * @author:WangHao
 */
public class TestIntEqual
{
	public static void main(String[] args)
	{
		int a = 1000, b = 1000;
		System.out.println(a == b);// 1
		Integer c = 127, d = 127;
		System.out.println(c == d);// 2
		Integer e = 1000, f = 1000;
		System.out.println(e == f);
		System.out.println(e.equals(f));
	}
}
