package com.qfedu.a_test;

public class Demo10 {
	public static void main(String[] args) {
		//打印3遍的 云想衣裳花想容
		/**
		 * i=0  0<3 true 就去执行大括号里面的代码  sout("云想衣裳花想容") i++
		 * i=1  1<3 true 打印第二遍的sout（"云想衣裳花想容"） i++
		 * i=2  2<3 true 打印第三遍的sout("云想衣裳花想容") i++
		 * i=3  3<3 false循环结束
		 */
		for (int i = 0; i < 3; i++) {
			System.out.println("云想衣裳花想容");
		}
	}

}
