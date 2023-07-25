package com.qfedu.a_test;

public class Demo3 {
	public static void main(String[] args) {
		//false || true  整体的结果就为true
		boolean ret1 = 3 > 4 || 5 > 3;
		System.out.println(ret1);//true
		
		boolean ret2 = 5 > 2 || 4 > 1 || 6 > 7;
		System.out.println(ret2);//true
		
		boolean ret3 = !(3 > 4);
		System.out.println(ret3);//true
	}

}
