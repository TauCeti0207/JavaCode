package com.qfedu.a_test;

public class Demo10 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		//=要先看右边  将右边值赋值给左边
		//num1 = num1 + num2;
		//简写的情况
		//num1 + num2 然后 在= 赋值 给谁啊 =左边的
		//
		num1 += num2;
		System.out.println(num1);//30
		int c;
		c = num1 + num2;//不能简写
		//以此类推  -=   *=  /=   %=  都有
		//num1 = num1 % num2;
		num1 %= num2;
		System.out.println(num1);//10
		
	}

}
