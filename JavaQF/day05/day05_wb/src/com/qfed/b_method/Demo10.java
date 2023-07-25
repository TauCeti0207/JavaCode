package com.qfed.b_method;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int i = scanner.nextInt();
		//isOddOrEven(i);
		System.out.println(isOddOrEven1(i));
	}
	//有参无返回值的方法
	public static void isOddOrEven (int a) {
		if (a % 2 == 0) {
			System.out.println("该数是偶数!!!");
		} else if (a % 2 == 1) {
			System.out.println("该数是奇数!!!");
		}
	}
	//有参有返回值的方法
	public static String isOddOrEven1 (int a) {
		if (a % 2 == 0) {
			return "该数是偶数";
		} else if (a % 2 == 1){
			return "该数是奇数";
		} else {
			return "输入错误";
		}
		
	}

}
