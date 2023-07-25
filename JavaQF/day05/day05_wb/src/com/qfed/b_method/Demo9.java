package com.qfed.b_method;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		
		 String str = isOddOrEven1();
		 System.out.println(str);
	}
	//判断一个数是否是偶数和奇数,不带参数的
	//无参无返回值的方法
	public static void isOddOrEven () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int i = scanner.nextInt();
		if (i % 2 == 0) {
			System.out.println("该数是偶数！！！");
		} else if (i % 2 == 1) {
			System.out.println("该数是奇数！！！");
		}
	}
	//无参有返回值的方法
	public static String isOddOrEven1 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int i = scanner.nextInt();
		if (i % 2 == 0) {
			return "该数是偶数!!!";
		} else {
			return "该数是奇数！！！";
		}
	}

}
