package com.qfedu.a_test;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		/**
		 * ѧ���ĳɼ���
		 * 90-100:��ӡ����
		 * 80-90����ӡ����
		 * 70-80����ӡһ��
		 * 60-70����ӡ����
		 * 60������:�мҳ�
		 */
		//if-else if
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ɼ�:");
		int score = scanner.nextInt();
		//������һ���ɼ�����
		if (score > 100 || score < 0) {
			System.out.println("����д�ĳɼ����󣡣���");
			//�˳���ǰ����
			System.exit(0);
		}
		if (score >= 90 && score <= 100) {
			System.out.println("����");
		} else if (score >= 80 ) {
			System.out.println("����");
		} else if (score >= 70 ) {
			System.out.println("һ��");
		} else if (score >= 60 ) {
			System.out.println("����");
		} else {
			System.out.println("�мҳ�");
		}
	}

}
