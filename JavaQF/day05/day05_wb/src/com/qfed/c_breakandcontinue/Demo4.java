package com.qfed.c_breakandcontinue;

public class Demo4 {
	public static void main(String[] args) {
		/**
		 * i=4  4<8 true 4%5==0 false sout(4) i++
		 * i=5 5<8 true  5%5==0 true  continue �����˱���ѭ�� i++
		 * i=6 6<8 true 6%5==0 falsesout(6) i++
		 * i=7 7<8 true 7%5==0false sout(7) i++
		 * i=8 8<8ѭ������
		 */
		for (int i = 4; i < 8; i++) {
			if (i % 5 == 0) {
				continue;//��������ѭ��ִ���´ε�ѭ��
			}
			System.out.println(i);
		}
	}

}
