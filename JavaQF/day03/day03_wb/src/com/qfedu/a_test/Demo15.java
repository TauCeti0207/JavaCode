package com.qfedu.a_test;

public class Demo15 {
	public static void main(String[] args) {
		int num = 1;
		//��Ҫ��ȥ��switch ����С���������ֵ�����ֵ�൱��Ҫ
		//��ΪҪȥƥ���� ���case  ����ĳ���
		switch (num) {
			case 1:
				System.out.println("���ְִ�绰");
				break;//��ֹ��ϵ���˼
			case 2:
				System.out.println("�������绰");
				break;//��ֹ��ϵ���˼
			case 3:
				System.out.println("��үү��绰");
				break;//��ֹ��ϵ���˼
			case 4:
				System.out.println("�����̴�绰");
				break;//��ֹ��ϵ���˼
			default:
				System.out.println("����");
				break;
		}
	}
}
