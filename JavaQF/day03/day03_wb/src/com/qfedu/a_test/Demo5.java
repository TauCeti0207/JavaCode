package com.qfedu.a_test;

public class Demo5 {
	public static void main(String[] args) {
		//�߼����·ԭ��
		int num = 10;
		//false && 
		boolean ret = (3 < 2) && (++num > 15) ;
		System.out.println(ret);//false
		System.out.println(num);//10
		
		//�߼���Ķ�·ԭ��
		int num1 = 10;
		boolean ret1 = (3 > 2) || (++num1 > 10);
		System.out.println(ret1);//true
		System.out.println(num1);//10
		
		//
		int num2 = 10;
		//�߼����ڵ�һ����ʱ���������1Ϊtrue�Ļ��������ȫ����ִ����
		//һ�㿪����Ҫô����ʹ���߼���Ҫô����ʹ���߼��򣬲�Ȼ̫������
		boolean ret2 = (3 > 2) || (++num2 > 15) && (3 > 2) && (++num2 > 20);
		System.out.println(ret2);//true
		System.out.println(num2);//10
		
	}

}
