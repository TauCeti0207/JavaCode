package com.qfed.d_method;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		isNumber();
		
	}
	//�ж�һ���ַ��Ƿ��������ַ�
	public static void isNumber () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		char c1 = scanner.next().charAt(0);
		if (c1 >= '0' && c1 <= '9') {
			System.out.println("�������ַ�");
		} else {
			System.out.println("���������ַ�");
		}
	}

}
