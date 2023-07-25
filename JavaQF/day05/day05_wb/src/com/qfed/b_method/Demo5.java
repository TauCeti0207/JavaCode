package com.qfed.b_method;

public class Demo5 {
	public static void main(String[] args) {
		add(5, 6);
		//将5赋值给a  将6 赋值给 b
		addDouble(45.3, 566.9, 89.3);
		printStr("大漠孤烟直");
		concate("落霞与孤鹜齐飞,", "秋水共长天一色");
		print1(1,  "狗蛋", 2.3, 'a');
	}
	//打印两个int类型数据的和
	//a  和 b  是形式参数，是占着位置的变量
	public static void add (int a, int b) {
		System.out.println(a + b);
	}
	//打印3个doule数据类型的和
	public static void addDouble (double d1, double d2, double d3) {
		System.out.println(d1 + d2 + d3);
	}
	//打印一个字符串
	public static void printStr (String str) {
		System.out.println(str);
	}
	//字符串拼接
	public static void concate (String str1, String str2) {
		System.out.println(str1 + str2);
	}
	//参数类型是不一致的情况
	public static void print1 (int i1,  String str1,double d1, char c1) {
		System.out.println(i1 +  str1 + d1 + c1 );
		
	}

}
