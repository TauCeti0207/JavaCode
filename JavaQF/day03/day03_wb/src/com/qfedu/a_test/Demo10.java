package com.qfedu.a_test;

public class Demo10 {
	public static void main(String[] args) {
		
		int num = 10;
		int num1 = 12;
		//if之间相互嵌套
		//10 > 8
		if (num > 8) {
			if (num1 > 20) {
				System.out.println("num1 大于了20");
			} else {
				System.out.println("num1小于20");
			}
		} else {
			System.out.println("num小于8");
		}
	}

}
