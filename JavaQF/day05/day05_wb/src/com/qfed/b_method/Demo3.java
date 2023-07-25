package com.qfed.b_method;

public class Demo3 {
	public static void main(String[] args) {
		printNineNineTable();
		//printNineNineTable();
		printPassSeven();
	}
	public static void printNineNineTable () {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i);
			} 
			System.out.println();
		}
	}
	//·ê7¹ý
	public static void printPassSeven () {
		for (int i = 1; i < 101; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.println("¹ý");
			} else {
				System.out.println(i);
			}
		}
	}

}
