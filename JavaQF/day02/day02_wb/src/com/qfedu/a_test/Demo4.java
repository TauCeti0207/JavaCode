package com.qfedu.a_test;

public class Demo4 {
	public static void main(String[] args) {
		byte b1 = 127;
		
		System.out.println(b1);
		//byte  数据范围  -128~127
		//b1 = 128;
		//你们感觉用byte多不多？不太多
		//short  -32768~32767
		short s1 = 899;
		s1 = 32767;
		System.out.println(s1);
		//short一点都不用
		
		//int  -2^31~  2^31-1  2147483648
		//int类型的数据，开发的时候整型的就用int
		//int是Java中默认的数据类型
		int i1 = 82922;
		i1 = 2147483647;
		System.out.println(i1);
		
		//348793030  这个值其实是int类型的数据
		long l1 = 348793030;
		System.out.println(l1);
		//凡是超过了int类型的范围声明long类型数据的时候
		//需要加L或者l,这样才能保证编译通过
		long l2 = 2147483648L;
		
		//会声明一个int类型的数据即可
		int age = 23;
		System.out.println(age);
		
		
	}

}
