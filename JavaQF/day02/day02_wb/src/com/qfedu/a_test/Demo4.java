package com.qfedu.a_test;

public class Demo4 {
	public static void main(String[] args) {
		byte b1 = 127;
		
		System.out.println(b1);
		//byte  ���ݷ�Χ  -128~127
		//b1 = 128;
		//���Ǹо���byte�಻�ࣿ��̫��
		//short  -32768~32767
		short s1 = 899;
		s1 = 32767;
		System.out.println(s1);
		//shortһ�㶼����
		
		//int  -2^31~  2^31-1  2147483648
		//int���͵����ݣ�������ʱ�����͵ľ���int
		//int��Java��Ĭ�ϵ���������
		int i1 = 82922;
		i1 = 2147483647;
		System.out.println(i1);
		
		//348793030  ���ֵ��ʵ��int���͵�����
		long l1 = 348793030;
		System.out.println(l1);
		//���ǳ�����int���͵ķ�Χ����long�������ݵ�ʱ��
		//��Ҫ��L����l,�������ܱ�֤����ͨ��
		long l2 = 2147483648L;
		
		//������һ��int���͵����ݼ���
		int age = 23;
		System.out.println(age);
		
		
	}

}
