package com.qfedu.a_test;

public class Demo9 {
	public static void main(String[] args) {
		//��
		int num1 = 20;  //20��ֵ��num1
		int num2 = 10;//��10 ��ֵ��num2
		//num1 = 20 + 10;
		//num1�Ǳ��� ���Ա仯����
		
		num1 =  num1 + num2;
		System.out.println(num1);//30
		//��
		int num3 = num1 - num2;
		System.out.println(num3);//20
		int a = 5;
		int b = 3;
		a = a * b;
		System.out.println(b);//3
		System.out.println(a);//15
		//��
		//ע�� ��Java�г���������С����  ȡ������
		int c = 2;
		c = b / c;//3/2
		System.out.println(c);//1
		//ȡ��
		int d = 6;
		d = a % d;//15 % 6
		System.out.println(d);//3
		//�ȳ˳���Ӽ�
		//1 + 3 * 3
		int e = c + d * b;
		System.out.println(e);//10
		//����С���������
		int f = (c + d) * b;
		System.out.println(f);
		
	}

}
