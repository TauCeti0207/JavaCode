package com.qfed.d_method;

public class Demo1 {
	public static void main(String[] args) {
		//max();
		//max1(89, 67);
		//System.out.println(max2());
		System.out.println(max3(150, 250));
	}
	//������int�����ֵ��
	//�޲��޷���ֵ�ķ���
	public static void max () {
		int a,b;
		a = 45;
		b = 69;
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
	}
	//�в��޷���ֵ�ķ���
	public static void max1(int a, int b) {
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
	//�޲��з���ֵ�ķ���
	public static int max2 () {
		int a,b;
		a = 45;
		b = 32;
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	//�в��з���ֵ�ķ���
	public  static int max3 (int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	

}
