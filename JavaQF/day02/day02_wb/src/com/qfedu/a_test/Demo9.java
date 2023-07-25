package com.qfedu.a_test;

public class Demo9 {
	public static void main(String[] args) {
		//加
		int num1 = 20;  //20赋值给num1
		int num2 = 10;//将10 赋值给num2
		//num1 = 20 + 10;
		//num1是变量 可以变化的量
		
		num1 =  num1 + num2;
		System.out.println(num1);//30
		//减
		int num3 = num1 - num2;
		System.out.println(num3);//20
		int a = 5;
		int b = 3;
		a = a * b;
		System.out.println(b);//3
		System.out.println(a);//15
		//除
		//注意 在Java中除法不能有小数点  取商整数
		int c = 2;
		c = b / c;//3/2
		System.out.println(c);//1
		//取余
		int d = 6;
		d = a % d;//15 % 6
		System.out.println(d);//3
		//先乘除后加减
		//1 + 3 * 3
		int e = c + d * b;
		System.out.println(e);//10
		//先算小括号里面的
		int f = (c + d) * b;
		System.out.println(f);
		
	}

}
