package com.qfedu.a_test;

public class Demo9 {

	public static void main(String[] args) {
		//打印3遍的晚上加班
		
		/**
		 * i = 0  第一个打印sout("晚上加班") i++   1<2 true
		 * 			打印第二个sout("晚上加班") i++  2<2 false
		 * 	循环结束 
		 * 		
		 */
		int i = 0;
		do {
			System.out.println("晚上加班");
			//i++放在了  布尔表达式的前面
			i++;
		} while (i < -1);
		
		
	}
}
