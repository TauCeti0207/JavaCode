package com.qfed.b_method;

public class Demo6 {
	public static void main(String[] args) {
		printChengFaBiao(100);
	}
	public static void printChengFaBiao (int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j*i);
			}
			System.out.println();
		}
	}

}
