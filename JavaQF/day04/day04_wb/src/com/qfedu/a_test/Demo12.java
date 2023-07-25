package com.qfedu.a_test;

public class Demo12 {
	public static void main(String[] args) {
		//打印1-10之间的奇数
		/**
		 * i=1 1<11 true 1%2==1 true sout(1) i++
		 * i=2 2<11 true 2%2==1 false i++
		 * i=3 3<11 true 3%2==1 true sout(3) i++
		 * i=4 4<11 true 4%2==1 false i++
		 * ......
		 */
//		for (int i = 1; i < 11; i++) {
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
//			
//		}
		/**
		 * i=1 1<11 sout(1) i=i+2 
		 * i=3 3<11 sout(3) i=i+2
		 * i=5  5<11 sout(5) i=i+2
		 * ...
		 */
		for (int i = 1; i < 11; i+=2) {
			System.out.println(i);
		}
	}

}
