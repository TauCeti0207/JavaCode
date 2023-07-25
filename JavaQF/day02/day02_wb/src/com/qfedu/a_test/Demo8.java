package com.qfedu.a_test;

public class Demo8 {
	public static void main(String[] args) {
		//数据类型 变量名字 = 初始化的值;
		String str = "一行白鹭上青天";
		System.out.println(str);
		
		//字符串拼接
		String name1 = "老邢";
		String name2 = "骚磊";
		System.out.println(name1 + "爱" + name2);
		int age = 89;
		System.out.println(name1 + age);//老邢89
		boolean b1 = true;
		System.out.println(name2 + b1);//骚磊true
		//一个字符串可以和任意的基本数据类型进行拼接
	}

}
