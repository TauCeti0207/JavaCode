package com.qfedu.a_test;

public class Demo5 {
	public static void main(String[] args) {
		//��ӡ  1 2  3  4  5
		int i = 1;
		/**
		 * i=1  1<6 true sout(1) i++
		 * 		2<6 true sout(2) i++
		 * 		3<6 true sout(3) i++
		 * 		4<6 true sout(4) i++
		 * 		5<6 true sout(5) i++
		 * 		6<6 false ѭ������
		 */
		while (i < 6) {
			//�պý����ڱ���i��ֵ
			System.out.println(i);
			i++;
		}
	}

}
