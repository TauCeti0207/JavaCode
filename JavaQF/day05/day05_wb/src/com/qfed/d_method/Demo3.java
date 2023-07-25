package com.qfed.d_method;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		isNumber();
		
	}
	//判断一个字符是否是数字字符
	public static void isNumber () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char c1 = scanner.next().charAt(0);
		if (c1 >= '0' && c1 <= '9') {
			System.out.println("是数字字符");
		} else {
			System.out.println("不是数字字符");
		}
	}

}
