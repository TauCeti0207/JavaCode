package com.qfed.a_for;

public class Demo2 {
	public static void main(String[] args) {
		//��ӡ����ֱ��������
		//ѧ����ϰ����
		for (int i = 4; i > 0; i--) {
			for (int j =1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
