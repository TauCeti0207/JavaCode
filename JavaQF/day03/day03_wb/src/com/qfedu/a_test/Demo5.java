package com.qfedu.a_test;

public class Demo5 {
	public static void main(String[] args) {
		//逻辑与短路原则
		int num = 10;
		//false && 
		boolean ret = (3 < 2) && (++num > 15) ;
		System.out.println(ret);//false
		System.out.println(num);//10
		
		//逻辑或的短路原则
		int num1 = 10;
		boolean ret1 = (3 > 2) || (++num1 > 10);
		System.out.println(ret1);//true
		System.out.println(num1);//10
		
		//
		int num2 = 10;
		//逻辑或在第一个的时候，如果条件1为true的话，后面的全部不执行了
		//一般开发中要么单独使用逻辑与要么单独使用逻辑或，不然太复杂了
		boolean ret2 = (3 > 2) || (++num2 > 15) && (3 > 2) && (++num2 > 20);
		System.out.println(ret2);//true
		System.out.println(num2);//10
		
	}

}
