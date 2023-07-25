package com.qfed.d_method;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		//控制台输入
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char c1 = scanner.next().charAt(0);
		System.out.println(isUpper(c1));
	}
	//判断一个字符是否是大写的字符
	public static String isUpper (char c1) {
		//if (c1 >= 'A' && c1 <= 'Z') {
		if (c1 >= 65 && c1 <= 90) {
			return "是大写的字母";
		} else {
			return "不是大写字母";
		}
	}

}
