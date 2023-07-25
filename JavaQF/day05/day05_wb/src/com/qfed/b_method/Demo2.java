package com.qfed.b_method;

public class Demo2 {
	
	public static void main(String[] args) {
		//在main主函数调用方法
		//
		printEat();
		printEat();
	}
	//在main方法的外部声明一个新的方法
	//无参 无返回值的方法
	public static void printEat () {
		for (int i = 0; i < 10; i++) {
			System.out.println("中午吃梅菜扣肉");
		}
	}
	

}
