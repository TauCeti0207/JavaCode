package com.qfedu.a_test;

public class Demo4 {
	public static void main(String[] args) {
		//��ӡ3���hello
		/**
		 * i = 0  0 < 3 true  sout("hello") ��ӡ��һ��hello  i++
		 * 		   1< 3 true sout("hello")  ��ӡ�ڶ����hello i++
		 * 		   2< 3 true sout("hello")  ��ӡ�������hello i++
		 * 		   3< 3 false  ����������Ĵ����ǲ�ִ�еģ�����ѭ������
		 * 		��ν��ѭ���������ǲ���ִ��while�ؼ���
		 */
		int i = 0;//1.��ʼ��������
		while (i < 3) {//3.ѭ������ֹ����i < 3
			System.out.println("hello");
			i++;//2.ѭ������
		}
		System.out.println("������");
	}

}
