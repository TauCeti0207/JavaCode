package com.qfedu.a_test;

public class Demo16 {

	public static void main(String[] args) {
		//System.out.println("*****");
		/**
		 * i=0 0<5 true 打印* i++
		 * i=1 1<5 true 打印** i++
		 * i=2 2>5 true 打印*** i++
		 * ...
		 * 打印*****
		 */
//		for (int i = 0; i < 5; i++) {
//			System.out.print("*");
//		}
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		/**
		 * 一定要把执行流程弄清楚
		 * i=0 0<3 true 执行外层循环后面大括号的代码
		 * 		进入到了内层循环了
		 * 		j=0 0<5 true 打印* j++
		 * 		j=1 1<5 true 打印** j++
		 * 		j=2 2<5 true 打印*** j++
		 * 		j=3 3<5 true 打印**** j++
		 * 		j=4 4<5 true 打印***** j++
		 * 		j=5 5<5 false 内层的循环结束  换行 i++
		 * i=1 1<3 true 进入到内层for循环了
		 * 		j=0 0<5 true 打印* j++  在第二行打印的
		 * 		j=1 1<5 true 打印** j++  
		 * 		j=2 2<5 true打印*** j++
		 * 		j=3 3<5 true 打印**** j++
		 * 		j=4 4<5 true 打印***** j++
		 * 		j=5 5<5 false  内层循环结束  换行 i++
		 * 
		 * i=2 2<3 true 进入内层循环
		 * 		j=0
		 * 告知我一个规律:最外层的循环控制的是行
		 * 				 最内层循环控制的是列
		 * 		id  name  age  info
		 * 		1    狗蛋    67    像老邢
		 * 		2    老邢     89   像狗蛋
		 * 		3    骚磊    78    臀大
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();//换行
		}
	}
}
