package com.qfed.b_method;

public class Demo7 {
	public static void main(String[] args) {
		printNum();//���ֻ�ǵ����Ĵ�ӡ��ʾ����
		int i1 = giveNum();//���Ի�ȡ����������һ���Ĳ���
		System.out.println(i1);
		//�õ�ֵ�Ժ�����һ���Ĳ���
		System.out.println(i1 + 15);//20
		String string = giveString();
		System.out.println(string);
		
	}
	//����һ�����������з���ֵ�ķ���
	public static int giveNum () {
		//This method must return a result of type int
		return 5;
		
		
	} 
	public static void printNum () {
		System.out.println(5);
	}
	//����ֵ���ַ������͵�����
	public static String giveString () {
		String str = "��ž���ʱ��ռ�";
		return str;
	}

}
