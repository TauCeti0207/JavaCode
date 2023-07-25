package com.qfedu.a_test;

public class Demo6 {
	public static void main(String[] args) {
		int num = 100;
		/**
		 * num  =100  100>97 true sout(100) num--
		 * 			  99>97 true sout(99) num--
		 * 			  98>97 true sout(98) num--
		 * 			  97>97 fasleÑ­»·ÖÕÖ¹
		 */
		while (num > 97) {
			System.out.println(num);
			num--;
		}
	}

}
