package com.qfedu.a_test;

public class Demo15 {
	public static void main(String[] args) {
		
		//求1-100数的和
		//要一个具体的数
		/**
		 * i=0 0<101 true sum = sum + i=>sum=0+0 i++
		 * i=1 1<101 true sum=sum+i=>sum=0 + 1 i++
		 * i=2 2<101 true sum=sum+i=>sum=0+1 +2 i++
		 * i=3 3<101 true sum=sum+i =>sum=0+1+2+3 i++
		 * i=4 4<101  ......=>sum = 0+1+2+3+4
		 * i=100 100<101..... sum=0+1+2+3+4+.... + 100
		 */
		int sum = 0;//初始化的值，是一个变量
		for (int i = 0; i < 101; i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
	}

}
