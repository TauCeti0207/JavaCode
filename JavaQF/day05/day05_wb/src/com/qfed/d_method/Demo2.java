package com.qfed.d_method;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		//����̨����
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		char c1 = scanner.next().charAt(0);
		System.out.println(isUpper(c1));
	}
	//�ж�һ���ַ��Ƿ��Ǵ�д���ַ�
	public static String isUpper (char c1) {
		//if (c1 >= 'A' && c1 <= 'Z') {
		if (c1 >= 65 && c1 <= 90) {
			return "�Ǵ�д����ĸ";
		} else {
			return "���Ǵ�д��ĸ";
		}
	}

}
