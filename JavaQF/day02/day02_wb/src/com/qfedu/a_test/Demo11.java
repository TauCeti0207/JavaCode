package com.qfedu.a_test;

public class Demo11 {
	public static void main(String[] args) {
		int num1 = 10;
		//num1++ ��ִ�е�ǰ�Ĳ������������1
		System.out.println(num1++);//10
		System.out.println(num1);//11
		int num2 = 5;
		//++num2  �������1 ��Ȼ��ִ�������Ĳ���
		System.out.println(++num2);//6
		System.out.println(num2);//6
		
		int num4 = 3;
		int ret = num4++ * num4;
		System.out.println(ret);//12
		System.out.println(num4);//4
		
		int num5 = 2;
		int ret1 = num5  * ++num5;
		System.out.println(ret1);//6
		System.out.println(num5);//3
		
	}
	

}
