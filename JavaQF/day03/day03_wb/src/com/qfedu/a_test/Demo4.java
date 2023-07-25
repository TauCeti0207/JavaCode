package com.qfedu.a_test;

public class Demo4 {
	public static void main(String[] args) {
		// true && (false || true)
		boolean ret = (3 > 2) && ((4 > 5) || (5 > 2));
		System.out.println(ret);//true
		//false || true && false || false && false
		//true && false|| false && false
		//false || false && false
		//false && false
		//false
		//!false
		boolean ret1 = !((8 > 9) || (7 > 2) && (8 < 4) || (6 > 7) && (8 < 1));
		System.out.println(ret1);//true
		
		boolean ret2 = (8 > 9) || !((7 > 2) && (8 > 4)) && (10 > 1) || (9 < 4);
		System.out.println(ret2);//false
	}

}
