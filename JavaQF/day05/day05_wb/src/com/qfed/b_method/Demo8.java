package com.qfed.b_method;

public class Demo8 {
	public static void main(String[] args) {
		int sum = add(3, 4, 5);
		System.out.println(sum);
		add1(3, 4, 5);
		System.out.println(judge(67.6, 89.8));//false
	}
	//求三个int类型数据的和  带有返回值的方法
	public static int add (int a, int b , int c) {
		return a + b + c;
	}
	public static void add1 (int a, int b, int c) {
		System.out.println(a + b + c);
	}
	//我现在脑海中有一个问题？这个形参和返回值类型有关系吗？
	//没有任何关系的
	//我想判断两个double类型的数据 如果 a 比 b大返回值一个true
	//反之返回false
	public static boolean judge (double a, double b) {
		if (a > b) {
			return true;
		} else {
			return false;
		}
	}
	

}
