package com.qfedu.a_test;

public class Demo15 {
	public static void main(String[] args) {
		int num = 1;
		//主要是去看switch 后面小括号里面的值，这个值相当重要
		//因为要去匹配下 面的case  后面的常量
		switch (num) {
			case 1:
				System.out.println("给爸爸打电话");
				break;//终止打断的意思
			case 2:
				System.out.println("给妈妈打电话");
				break;//终止打断的意思
			case 3:
				System.out.println("给爷爷打电话");
				break;//终止打断的意思
			case 4:
				System.out.println("给奶奶打电话");
				break;//终止打断的意思
			default:
				System.out.println("报警");
				break;
		}
	}
}
