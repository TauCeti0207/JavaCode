package com.qfed.b_method;

public class Demo1 {
	public static void main(String[] args) {
//		for (int i = 0; i < 20; i++) {
//			System.out.println("world");
//		}
		printWorld();
		System.out.println("============");
//		for (int i = 0; i < 20; i++) {
//			System.out.println("wolrd");
//		}
		printWorld();
		System.out.println("-------------");
//		for (int i = 0; i < 20; i++) {
//			System.out.println("world");
//		}
		printWorld();
		//我讲打印20遍的world这个功能把他弄到一个方法中
	}
	//写一个方法
	//public static void   修饰
	public static void printWorld () {
		for (int i = 0; i < 20; i++) {
			System.out.println("xixida");
		}
	}
	

}
