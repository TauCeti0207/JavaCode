package com.qfedu.a_test;

public class Demo9 {
	public static void main(String[] args) {
		//> 案例:判断一个年份是否是闰年。
		//>
		//> 注意:能被4整除，并且不能被100整除,或者能被400整除的年份
		int year = 2100;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
		
	}

}
