package com.qfedu.a_test;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		/**
		 * 学生的成绩：
		 * 90-100:打印优秀
		 * 80-90：打印良好
		 * 70-80：打印一般
		 * 60-70：打印及格
		 * 60分以下:叫家长
		 */
		//if-else if
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩:");
		int score = scanner.nextInt();
		//声明了一个成绩变量
		if (score > 100 || score < 0) {
			System.out.println("您书写的成绩有误！！！");
			//退出当前程序
			System.exit(0);
		}
		if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 80 ) {
			System.out.println("良好");
		} else if (score >= 70 ) {
			System.out.println("一般");
		} else if (score >= 60 ) {
			System.out.println("及格");
		} else {
			System.out.println("叫家长");
		}
	}

}
