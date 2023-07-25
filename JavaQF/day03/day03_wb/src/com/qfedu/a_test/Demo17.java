package com.qfedu.a_test;

public class Demo17 {
	public static void main(String[] args) {
		//switch小括号里面是一个表达式
		//这个表达式是一个具体的一个值
		//那么就应该有对应的数据类型
		//那么这个表达式的数据类型应该是啥?
		//int  short  byte  char   
		//String  jdk1.8及以后的版本的
		//枚举
		//Cannot switch on a value of type long. 
		//Only convertible int values,
		//strings or enum variables are permitted
		//long num = 7;
		char c = 'b';
		String str = "中国";
		switch (str) {
		case "小日本":
			System.out.println("细细打");
			break;
		case "漂亮国":
			System.out.println("呵呵哒");
			break;
		case "中国":
			System.out.println("哈哈哒");
			break;
		case "泡菜国":
			System.out.println("今年夏季那是你");
			break;
		default:
			break;
		}
	}

}
