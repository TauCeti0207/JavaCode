package com.qfedu.a_test;

public class Demo18 {
	public static void main(String[] args) {
		//�������Ƿ���ִ�����̣�������
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();//����
		}
	}

}
