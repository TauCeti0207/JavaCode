package com.qfed.b_method;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		
		 String str = isOddOrEven1();
		 System.out.println(str);
	}
	//�ж�һ�����Ƿ���ż��������,����������
	//�޲��޷���ֵ�ķ���
	public static void isOddOrEven () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������:");
		int i = scanner.nextInt();
		if (i % 2 == 0) {
			System.out.println("������ż��������");
		} else if (i % 2 == 1) {
			System.out.println("����������������");
		}
	}
	//�޲��з���ֵ�ķ���
	public static String isOddOrEven1 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������:");
		int i = scanner.nextInt();
		if (i % 2 == 0) {
			return "������ż��!!!";
		} else {
			return "����������������";
		}
	}

}
