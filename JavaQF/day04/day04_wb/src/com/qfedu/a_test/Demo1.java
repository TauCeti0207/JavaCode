package com.qfedu.a_test;

public class Demo1 {
	public static void main(String[] args) {
		int a = 30;
		int c;
		//���a> 30�Ļ��� true����250 ��ֵ��c�������
		//���a > 30Ϊfalse�Ļ�����360��ֵ��c�������
		c = a > 30 ? 250 : 360;
		System.out.println(c);
		if (a > 30) {
			c = 250;
			System.out.println(c);
		} else {
			c = 360;
			System.out.println(c);
		}
		
	}

}
