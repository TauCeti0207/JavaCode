package com.qfedu.a_test;

public class Demo9 {

	public static void main(String[] args) {
		//��ӡ3������ϼӰ�
		
		/**
		 * i = 0  ��һ����ӡsout("���ϼӰ�") i++   1<2 true
		 * 			��ӡ�ڶ���sout("���ϼӰ�") i++  2<2 false
		 * 	ѭ������ 
		 * 		
		 */
		int i = 0;
		do {
			System.out.println("���ϼӰ�");
			//i++������  �������ʽ��ǰ��
			i++;
		} while (i < -1);
		
		
	}
}
