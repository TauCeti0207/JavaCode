package com.qfedu.a_test;

public class Demo10 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		//=Ҫ�ȿ��ұ�  ���ұ�ֵ��ֵ�����
		//num1 = num1 + num2;
		//��д�����
		//num1 + num2 Ȼ�� ��= ��ֵ ��˭�� =��ߵ�
		//
		num1 += num2;
		System.out.println(num1);//30
		int c;
		c = num1 + num2;//���ܼ�д
		//�Դ�����  -=   *=  /=   %=  ����
		//num1 = num1 % num2;
		num1 %= num2;
		System.out.println(num1);//10
		
	}

}
