package com.qfedu.a_test;

public class Demo4 {
	public static void main(String[] args) {
		//打印3遍的hello
		/**
		 * i = 0  0 < 3 true  sout("hello") 打印第一个hello  i++
		 * 		   1< 3 true sout("hello")  打印第二遍的hello i++
		 * 		   2< 3 true sout("hello")  打印第三遍的hello i++
		 * 		   3< 3 false  大括号里面的代码是不执行的，并且循环结束
		 * 		所谓的循环结束就是不再执行while关键字
		 */
		int i = 0;//1.初始话的条件
		while (i < 3) {//3.循环的终止条件i < 3
			System.out.println("hello");
			i++;//2.循环条件
		}
		System.out.println("嘻嘻哒");
	}

}
