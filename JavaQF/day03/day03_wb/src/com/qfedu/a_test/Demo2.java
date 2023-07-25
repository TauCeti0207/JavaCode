package com.qfedu.a_test;

public class Demo2 {

	public static void main(String[] args) {
		boolean ret1 = 3 > 4 && 5 < 6;
		System.out.println(ret1);//false
		
		boolean ret2 = (4 > 3) && (3 > 2);
		System.out.println(ret2);//true
		
		boolean ret3 = (7 > 4) && (5 > 2) && (7 >1);
		System.out.println(ret3);//true
		
	}
}
