package com.qfed.b_method;

public class Demo8 {
	public static void main(String[] args) {
		int sum = add(3, 4, 5);
		System.out.println(sum);
		add1(3, 4, 5);
		System.out.println(judge(67.6, 89.8));//false
	}
	//������int�������ݵĺ�  ���з���ֵ�ķ���
	public static int add (int a, int b , int c) {
		return a + b + c;
	}
	public static void add1 (int a, int b, int c) {
		System.out.println(a + b + c);
	}
	//�������Ժ�����һ�����⣿����βκͷ���ֵ�����й�ϵ��
	//û���κι�ϵ��
	//�����ж�����double���͵����� ��� a �� b�󷵻�ֵһ��true
	//��֮����false
	public static boolean judge (double a, double b) {
		if (a > b) {
			return true;
		} else {
			return false;
		}
	}
	

}
