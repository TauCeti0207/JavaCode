package com.qfed.a_for;

public class Demo1 {

	public static void main(String[] args) {
		/**
		 * i=1 1<5 true 
		 * 		进入到内层第一个for循环
		 * 		j=1 1<=3 true 打印第一个空格 j++
		 * 		j=2 2<=3 true 打印第二个空格 j++
		 * 		j=3 3<=3 true 打印第3个空格 j++
		 * 		j=4 4<=3 false 循环结束
		 * 		进入倒内层的第二个for循环
		 * 		k=1 1<=1 打印第一个* k++
		 * 		k=2 2<=1 false 循环 结束 换行 i++
		 * i=2...
		 * 	
		 * 	
		 * 	
		 */
		for (int i = 1; i < 5; i++) {//控制是行数  
			
			for (int j = 1; j <= 4 - i; j++) {//打印的空格的列
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {//打印*这个列
				System.out.print("*");
				
			}
			System.out.println();//换行
		}
	}
}
