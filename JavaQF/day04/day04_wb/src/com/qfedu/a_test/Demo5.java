package com.qfedu.a_test;

public class Demo5 {
	public static void main(String[] args) {
		//打印  1 2  3  4  5
		int i = 1;
		/**
		 * i=1  1<6 true sout(1) i++
		 * 		2<6 true sout(2) i++
		 * 		3<6 true sout(3) i++
		 * 		4<6 true sout(4) i++
		 * 		5<6 true sout(5) i++
		 * 		6<6 false 循环结束
		 */
		while (i < 6) {
			//刚好借助于变量i的值
			System.out.println(i);
			i++;
		}
	}

}
