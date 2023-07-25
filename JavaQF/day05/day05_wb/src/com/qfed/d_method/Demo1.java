package com.qfed.d_method;

public class Demo1 {
	public static void main(String[] args) {
		//max();
		//max1(89, 67);
		//System.out.println(max2());
		System.out.println(max3(150, 250));
	}
	//求两个int的最大值的
	//无参无返回值的方法
	public static void max () {
		int a,b;
		a = 45;
		b = 69;
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
	}
	//有参无返回值的方法
	public static void max1(int a, int b) {
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
	//无参有返回值的方法
	public static int max2 () {
		int a,b;
		a = 45;
		b = 32;
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	//有参有返回值的方法
	public  static int max3 (int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	

}
