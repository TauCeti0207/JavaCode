package com.qfedu.a_test;

public class Demo17 {
	public static void main(String[] args) {
		//��ӡһ��ֱ��������
		/**
		 * i=1 1<=4 true  ���뵽�ڲ��ѭ��
		 * 		j=1 1<=1 true ��ӡ* j++
		 * 		j=2 2<=1 false  ���� i++
		 * i=2 2<4 true ���뵽�ڲ��ѭ��
		 * 		j=1 1<=3 true ��ӡ* j++
		 * 		j=2 2<=3 true ��ӡ** j++
		 * 		j=3 3<=3 true ��ӡ*** j++
		 * 		j=4 4<=3false ���� i++
		 * i=3 3<=4 true ���뵽�ڲ�ѭ��
		 * 		j=1 1<=5 true ��ӡ* j++
		 * 		j=2 2<=5 true ��ӡ** j++
		 * 		j=3 3<=5 true ��ӡ*** j++
		 * 		j=4 4<=5 true ��ӡ**** j++
		 * 		j=5 5<=5 true ��ӡ***** j++	
		 * 		j=6 6<=5 false ���� i++
		 * 
		 */
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
