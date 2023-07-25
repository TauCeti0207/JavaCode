package com.qfed.c_breakandcontinue;

public class Demo2 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);//5
				break;
			}
			System.out.println(i);//1  2   3  4
		}
	}
	//今天你们试一下   for循环里面使用switch-case
	//语法格式完全可以的，但是swicth-case里面的break;不会终止循环
	

}
