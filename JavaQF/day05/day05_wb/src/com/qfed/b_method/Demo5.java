package com.qfed.b_method;

public class Demo5 {
	public static void main(String[] args) {
		add(5, 6);
		//��5��ֵ��a  ��6 ��ֵ�� b
		addDouble(45.3, 566.9, 89.3);
		printStr("��Į����ֱ");
		concate("��ϼ��������,", "��ˮ������һɫ");
		print1(1,  "����", 2.3, 'a');
	}
	//��ӡ����int�������ݵĺ�
	//a  �� b  ����ʽ��������ռ��λ�õı���
	public static void add (int a, int b) {
		System.out.println(a + b);
	}
	//��ӡ3��doule�������͵ĺ�
	public static void addDouble (double d1, double d2, double d3) {
		System.out.println(d1 + d2 + d3);
	}
	//��ӡһ���ַ���
	public static void printStr (String str) {
		System.out.println(str);
	}
	//�ַ���ƴ��
	public static void concate (String str1, String str2) {
		System.out.println(str1 + str2);
	}
	//���������ǲ�һ�µ����
	public static void print1 (int i1,  String str1,double d1, char c1) {
		System.out.println(i1 +  str1 + d1 + c1 );
		
	}

}
