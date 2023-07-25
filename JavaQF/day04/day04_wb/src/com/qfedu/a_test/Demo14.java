package com.qfedu.a_test;

public class Demo14 {
	public static void main(String[] args) {
		/**
		 * i=6 6<101 true sout(6) i++
		 * i=7 7<101 true sout("¹ý") i++
		 * ......
		 */
		for (int i = 1; i < 101; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.println("¹ý");
			} else {
				System.out.println(i);
			}
		}
	}

}
