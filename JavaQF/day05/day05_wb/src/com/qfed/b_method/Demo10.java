package com.qfed.b_method;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������:");
		int i = scanner.nextInt();
		//isOddOrEven(i);
		System.out.println(isOddOrEven1(i));
	}
	//�в��޷���ֵ�ķ���
	public static void isOddOrEven (int a) {
		if (a % 2 == 0) {
			System.out.println("������ż��!!!");
		} else if (a % 2 == 1) {
			System.out.println("����������!!!");
		}
	}
	//�в��з���ֵ�ķ���
	public static String isOddOrEven1 (int a) {
		if (a % 2 == 0) {
			return "������ż��";
		} else if (a % 2 == 1){
			return "����������";
		} else {
			return "�������";
		}
		
	}

}
