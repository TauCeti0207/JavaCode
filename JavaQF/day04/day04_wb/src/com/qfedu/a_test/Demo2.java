package com.qfedu.a_test;

import java.util.Scanner;

//输入一个整数，判断这个整数是大于0，还是小于0,还是等于0。
public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int a =  scanner.nextInt();
//		if (a > 0) {
//			System.out.println("这个整数大于0");
//		} else if (a < 0) {
//			System.out.println("这个整数小于0");
//		} else {
//			System.out.println("这个整数等于0");
//		}
		//a > 0 是true的时候 直接将"这个整数大于0"  赋值给str
		//a > 0是false的时候 又执行  a < 0  ? "这个整数小于0" : "这个整数等于0";  又是一个三目运算符
		//a < 0 是true的话，"这个整数小于0" 赋值给str   不然则 
		String str = a > 0 ? "这个整数大于0" : a < 0  ? "这个整数小于0" : "这个整数等于0";
		System.out.println(str);
	}

}
