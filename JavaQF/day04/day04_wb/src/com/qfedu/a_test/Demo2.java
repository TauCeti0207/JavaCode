package com.qfedu.a_test;

import java.util.Scanner;

//����һ���������ж���������Ǵ���0������С��0,���ǵ���0��
public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������:");
		int a =  scanner.nextInt();
//		if (a > 0) {
//			System.out.println("�����������0");
//		} else if (a < 0) {
//			System.out.println("�������С��0");
//		} else {
//			System.out.println("�����������0");
//		}
		//a > 0 ��true��ʱ�� ֱ�ӽ�"�����������0"  ��ֵ��str
		//a > 0��false��ʱ�� ��ִ��  a < 0  ? "�������С��0" : "�����������0";  ����һ����Ŀ�����
		//a < 0 ��true�Ļ���"�������С��0" ��ֵ��str   ��Ȼ�� 
		String str = a > 0 ? "�����������0" : a < 0  ? "�������С��0" : "�����������0";
		System.out.println(str);
	}

}
