package com.qfedu.a_test;

public class Demo9 {
	public static void main(String[] args) {
		//> ����:�ж�һ������Ƿ������ꡣ
		//>
		//> ע��:�ܱ�4���������Ҳ��ܱ�100����,�����ܱ�400���������
		int year = 2100;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("������");
		} else {
			System.out.println("��������");
		}
		
	}

}
