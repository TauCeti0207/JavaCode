package com.qfed.a_for;

public class Demo1 {

	public static void main(String[] args) {
		/**
		 * i=1 1<5 true 
		 * 		���뵽�ڲ��һ��forѭ��
		 * 		j=1 1<=3 true ��ӡ��һ���ո� j++
		 * 		j=2 2<=3 true ��ӡ�ڶ����ո� j++
		 * 		j=3 3<=3 true ��ӡ��3���ո� j++
		 * 		j=4 4<=3 false ѭ������
		 * 		���뵹�ڲ�ĵڶ���forѭ��
		 * 		k=1 1<=1 ��ӡ��һ��* k++
		 * 		k=2 2<=1 false ѭ�� ���� ���� i++
		 * i=2...
		 * 	
		 * 	
		 * 	
		 */
		for (int i = 1; i < 5; i++) {//����������  
			
			for (int j = 1; j <= 4 - i; j++) {//��ӡ�Ŀո����
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {//��ӡ*�����
				System.out.print("*");
				
			}
			System.out.println();//����
		}
	}
}
