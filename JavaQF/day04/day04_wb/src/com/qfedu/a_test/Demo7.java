package com.qfedu.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//打印1  3  5 7
		//思路：能不能先找到 1  2  3  4  5 6   7
		//之后能不能在循环中写if语句进行哦判断输出
		/**
		 * i = 1  1<8 true  1%2!=0 true sout(1) i++
		 * i=2    2<8 true   2%2!=0 false i++
		 * i=3   3<8 true   3%2!=0 true  sout(3) i++
		 * i=4   4<8 true   4%2!=0 false i++
		 * i=5   5<8 true   5%2 !=0 true sout(5) i++
		 * i=6   6<8 ...... i++
		 * i=7  7< 8  true  7%2!=0 true  sout(7)
		 * 
		 */
//		int i = 1;
//		while (i < 8) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		/**
		 * i = 1 1< 8 true sout(1) i= i+ 2  i=1+2
		 * i=3    3<8 true sout(3) i=i+2    i=3+2
		 * i=5   5<8 true sout(5) i= i+2   i=5+2
		 * i=7  7<8 true sout(7) i=i+2   i=7+2
		 * i=9 9<8 false
		 */
		int i = 1;
		while (i < 8) {
			System.out.println(i);
			//i = i + 2;//循环条件
			i += 2;
		}
	}

}
