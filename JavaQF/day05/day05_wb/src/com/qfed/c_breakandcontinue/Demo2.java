package com.qfed.c_breakandcontinue;

public class Demo2 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);//5
				break;
			}
			System.out.println(i);//1  2   3  4
		}
	}
	//����������һ��   forѭ������ʹ��switch-case
	//�﷨��ʽ��ȫ���Եģ�����swicth-case�����break;������ֹѭ��
	

}
