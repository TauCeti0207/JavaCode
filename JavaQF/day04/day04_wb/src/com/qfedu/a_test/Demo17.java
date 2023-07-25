package com.qfedu.a_test;

public class Demo17 {
	public static void main(String[] args) {
		//打印一个直角三角形
		/**
		 * i=1 1<=4 true  进入到内层的循环
		 * 		j=1 1<=1 true 打印* j++
		 * 		j=2 2<=1 false  换行 i++
		 * i=2 2<4 true 进入到内层的循环
		 * 		j=1 1<=3 true 打印* j++
		 * 		j=2 2<=3 true 大印** j++
		 * 		j=3 3<=3 true 打印*** j++
		 * 		j=4 4<=3false 换行 i++
		 * i=3 3<=4 true 进入到内层循环
		 * 		j=1 1<=5 true 打印* j++
		 * 		j=2 2<=5 true 打印** j++
		 * 		j=3 3<=5 true 打印*** j++
		 * 		j=4 4<=5 true 打印**** j++
		 * 		j=5 5<=5 true 打印***** j++	
		 * 		j=6 6<=5 false 换行 i++
		 * 
		 */
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
