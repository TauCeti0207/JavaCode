package com.qfedu.a_test;

public class Demo1 {
	public static void main(String[] args) {
		int a = 30;
		int c;
		//如果a> 30的话， true，将250 赋值给c这个变量
		//如果a > 30为false的话，将360赋值给c这个变量
		c = a > 30 ? 250 : 360;
		System.out.println(c);
		if (a > 30) {
			c = 250;
			System.out.println(c);
		} else {
			c = 360;
			System.out.println(c);
		}
		
	}

}
