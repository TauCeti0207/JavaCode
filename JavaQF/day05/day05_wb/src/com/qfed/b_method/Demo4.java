package com.qfed.b_method;

public class Demo4 {
	public static void main(String[] args) {
		printHello(8);
		//在方法额调用处  18啥意思？
		//18是实际参数 又叫实参  会讲实参赋值给形参，让形参具备真实的意义
		
		//将18赋值给方法的声明处的那个变量   num
	}
	//打印4遍的hello
	//此时方法的声明处 int  num  是形式参数  又叫形参
	//只是一个形式而已
	public static void printHello (int a) {
		for (int i = 0; i < a; i++) {
			System.out.println("hello");
		}
	}

}
