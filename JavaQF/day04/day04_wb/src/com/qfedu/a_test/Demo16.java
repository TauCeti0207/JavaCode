package com.qfedu.a_test;

public class Demo16 {

	public static void main(String[] args) {
		//System.out.println("*****");
		/**
		 * i=0 0<5 true ��ӡ* i++
		 * i=1 1<5 true ��ӡ** i++
		 * i=2 2>5 true ��ӡ*** i++
		 * ...
		 * ��ӡ*****
		 */
//		for (int i = 0; i < 5; i++) {
//			System.out.print("*");
//		}
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		/**
		 * һ��Ҫ��ִ������Ū���
		 * i=0 0<3 true ִ�����ѭ����������ŵĴ���
		 * 		���뵽���ڲ�ѭ����
		 * 		j=0 0<5 true ��ӡ* j++
		 * 		j=1 1<5 true ��ӡ** j++
		 * 		j=2 2<5 true ��ӡ*** j++
		 * 		j=3 3<5 true ��ӡ**** j++
		 * 		j=4 4<5 true ��ӡ***** j++
		 * 		j=5 5<5 false �ڲ��ѭ������  ���� i++
		 * i=1 1<3 true ���뵽�ڲ�forѭ����
		 * 		j=0 0<5 true ��ӡ* j++  �ڵڶ��д�ӡ��
		 * 		j=1 1<5 true ��ӡ** j++  
		 * 		j=2 2<5 true��ӡ*** j++
		 * 		j=3 3<5 true ��ӡ**** j++
		 * 		j=4 4<5 true ��ӡ***** j++
		 * 		j=5 5<5 false  �ڲ�ѭ������  ���� i++
		 * 
		 * i=2 2<3 true �����ڲ�ѭ��
		 * 		j=0
		 * ��֪��һ������:������ѭ�����Ƶ�����
		 * 				 ���ڲ�ѭ�����Ƶ�����
		 * 		id  name  age  info
		 * 		1    ����    67    ������
		 * 		2    ����     89   �񹷵�
		 * 		3    ɧ��    78    �δ�
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();//����
		}
	}
}
