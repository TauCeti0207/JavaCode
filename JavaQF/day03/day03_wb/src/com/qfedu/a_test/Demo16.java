package com.qfedu.a_test;

public class Demo16 {
	public static void main(String[] args) {
		
		int score = 78;
		switch (score / 10) {
		case 10:
			System.out.println("优秀");
			break;
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("一般");
			break;
		case 6:
			System.out.println("及格");
			break;
		default:
			System.out.println("叫家长");
			break;
		}
	}

}
