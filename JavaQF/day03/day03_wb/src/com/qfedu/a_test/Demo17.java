package com.qfedu.a_test;

public class Demo17 {
	public static void main(String[] args) {
		//switchС����������һ�����ʽ
		//������ʽ��һ�������һ��ֵ
		//��ô��Ӧ���ж�Ӧ����������
		//��ô������ʽ����������Ӧ����ɶ?
		//int  short  byte  char   
		//String  jdk1.8���Ժ�İ汾��
		//ö��
		//Cannot switch on a value of type long. 
		//Only convertible int values,
		//strings or enum variables are permitted
		//long num = 7;
		char c = 'b';
		String str = "�й�";
		switch (str) {
		case "С�ձ�":
			System.out.println("ϸϸ��");
			break;
		case "Ư����":
			System.out.println("�Ǻ���");
			break;
		case "�й�":
			System.out.println("������");
			break;
		case "�ݲ˹�":
			System.out.println("�����ļ�������");
			break;
		default:
			break;
		}
	}

}
