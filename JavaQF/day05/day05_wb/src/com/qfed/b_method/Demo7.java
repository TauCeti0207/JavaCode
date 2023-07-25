package com.qfed.b_method;

public class Demo7 {
	public static void main(String[] args) {
		printNum();//这个只是单纯的打印显示而已
		int i1 = giveNum();//可以获取出来进行下一步的操作
		System.out.println(i1);
		//拿到值以后做下一步的操作
		System.out.println(i1 + 15);//20
		String string = giveString();
		System.out.println(string);
		
	}
	//定义一个方法，带有返回值的方法
	public static int giveNum () {
		//This method must return a result of type int
		return 5;
		
		
	} 
	public static void printNum () {
		System.out.println(5);
	}
	//返回值是字符串类型的数据
	public static String giveString () {
		String str = "你才觉得时间空间";
		return str;
	}

}
