```
1.jdk安装和环境变量地配置
2.使用notepad++书写第一个Java代码
class HelloWorld {
	public static void main (String[] args) {
		
	}
}
3.会使用eclipse新建咱们第一个Java工程
4.变量的语法格式
	数据类型  变量名字 = c初始化的值;
	int a = 20;
5.数据类型
	八大基本数据类型
		整型:  byte short int long
		开发使用int
		浮点:  float  double 
		字符:  char   '\'
		布尔:  boolean 
		
	引用数据类型:
		String 声明字符串类型的类型数据的  使用双引号  
	变量的命名规范:
		1,首字母是要小写的
		2.一般由数字，字母,_,$等组成的，但是不能以数字开头
		3.一般使用小驼峰的命名规则，或者使用单词拼接下划线组成的
		4.见名知意（英文）
		5.不能使用Java的关键字
	
6.运算符
	1.算术运算符
		+   -  *  /  %  +=  -=   *= /=  %=  ++  --
	2.关系运算符
		>  <  >=   <=   !=  == 
	3.逻辑运算符
		&&   ||  !
	
	逻辑运算符的短路原则
	
7.分支结构
	if () {
	
	} 
	 if () {
	 
	 } else {
	 
	 }
	 
	 if () {
	 
	 } else if () {
	 
	 } else if () {
	 
	 } else {
	 
	 }
	 switch () {
	 	case 常量:
	 		break;
	 	default:
	 		
	 }
8.控制台输入
	1.导包
		improt java.util.Scanner;
	2.创建Scanner对象
		Scanner sc = new Scanner(System.in);
	3.从控制台获取任意类型的数据
		nextInt()
		nextFloat()
		nextDouble()
		nextBoolean()
		next()  字符串
		nextLine()字符串
		next().charAt(int index)
```

### 今天的内容

> 1.三目运算符
>
> 2.循环结构

### 1.三目运算符

> 开发用的很多。
>
> 语法格式:
>
> ```
> 数据类型  x = (表达式)　? value1 :  value2;
> ```
>
> 执行流程:  当表达式 为true的时候，将value1赋值给x。  当表达式为false的时候，将value2赋值给x

```java 
package com.qfedu.a_test;

public class Demo1 {
	public static void main(String[] args) {
		int a = 30;
		int c;
		//如果a> 30的话， true，将250 赋值给c这个变量
		//如果a > 30为false的话，将360赋值给c这个变量
		c = a > 30 ? 250 : 360;
		System.out.println(c);
		if (a > 30) {
			c = 250;
			System.out.println(c);
		} else {
			c = 360;
			System.out.println(c);
		}
		
	}

}

```

```java 
package com.qfedu.a_test;

import java.util.Scanner;

//输入一个整数，判断这个整数是大于0，还是小于0,还是等于0。
public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int a =  scanner.nextInt();
//		if (a > 0) {
//			System.out.println("这个整数大于0");
//		} else if (a < 0) {
//			System.out.println("这个整数小于0");
//		} else {
//			System.out.println("这个整数等于0");
//		}
		//a > 0 是true的时候 直接将"这个整数大于0"  赋值给str
		//a > 0是false的时候 又执行  a < 0  ? "这个整数小于0" : "这个整数等于0";  又是一个三目运算符
		//a < 0 是true的话，"这个整数小于0" 赋值给str   不然则 
		String str = a > 0 ? "这个整数大于0" : a < 0  ? "这个整数小于0" : "这个整数等于0";
		System.out.println(str);
	}

}

```

### 2.循环结构

#### 2.1为啥会有循环结构

> 如果代码中出现了大量的重复的或者有规律的代码的话，使用cv大法
>
> 1.代码臃肿
>
> 2.阅读性差
>
> 3.维护性特别差
>
> 循环可以解决以上的问题:
>
> ​		循环的三个条件:1.初始化条件  2.循环条件  3.终止条件

会讲三个循环:  while 循环  do-while循环  for循环

#### 2.2while循环

> 语法格式:
>
> ```Java
> while (布尔表达式) {
> 	循环体;
> }
> ```
>
> 执行流程:当代码执行到while以后，会去判断while后面的布尔表达式，如果布尔表达式为true的话，会执行大括号后面的循环体这个代码。执行完以后，再次回到while关键，再去判断布尔表达式，如果布尔表达式为true的话，再次执行循环体。执行完以后，再次回到while关键，再次判断布尔表达式，直到布尔表达式为false的话，就结束循环，就不再执行循环体，也不会回到while关键字

```Java
package com.qfedu.a_test;

public class Demo4 {
	public static void main(String[] args) {
		//打印3遍的hello
		/**
		 * i = 0  0 < 3 true  sout("hello") 打印第一个hello  i++
		 * 		   1< 3 true sout("hello")  打印第二遍的hello i++
		 * 		   2< 3 true sout("hello")  打印第三遍的hello i++
		 * 		   3< 3 false  大括号里面的代码是不执行的，并且循环结束
		 * 		所谓的循环结束就是不再执行while关键字
		 */
		int i = 0;//1.初始话的条件
		while (i < 3) {//3.循环的终止条件i < 3
			System.out.println("hello");
			i++;//2.循环条件
		}
		System.out.println("嘻嘻哒");
	}

}

```

> 案例:利用循环打印1  2  3   4  5

```Java
package com.qfedu.a_test;

public class Demo5 {
	public static void main(String[] args) {
		//打印  1 2  3  4  5
		int i = 1;
		/**
		 * i=1  1<6 true sout(1) i++
		 * 		2<6 true sout(2) i++
		 * 		3<6 true sout(3) i++
		 * 		4<6 true sout(4) i++
		 * 		5<6 true sout(5) i++
		 * 		6<6 false 循环结束
		 */
		while (i < 6) {
			//刚好借助于变量i的值
			System.out.println(i);
			i++;
		}
	}

}

```

> 案例：输出100  99  98  

```Java
package com.qfedu.a_test;

public class Demo6 {
	public static void main(String[] args) {
		int num = 100;
		/**
		 * num  =100  100>97 true sout(100) num--
		 * 			  99>97 true sout(99) num--
		 * 			  98>97 true sout(98) num--
		 * 			  97>97 fasle循环终止
		 */
		while (num > 97) {
			System.out.println(num);
			num--;
		}
	}

}

```

> 案例：打印  1   3   5   7   9

```Java
package com.qfedu.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//打印1  3  5 7
		//思路：能不能先找到 1  2  3  4  5 6   7
		//之后能不能在循环中写if语句进行哦判断输出
		/**
		 * i = 1  1<8 true  1%2!=0 true sout(1) i++
		 * i=2    2<8 true   2%2!=0 false i++
		 * i=3   3<8 true   3%2!=0 true  sout(3) i++
		 * i=4   4<8 true   4%2!=0 false i++
		 * i=5   5<8 true   5%2 !=0 true sout(5) i++
		 * i=6   6<8 ...... i++
		 * i=7  7< 8  true  7%2!=0 true  sout(7)
		 * 
		 */
//		int i = 1;
//		while (i < 8) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		/**
		 * i = 1 1< 8 true sout(1) i= i+ 2  i=1+2
		 * i=3    3<8 true sout(3) i=i+2    i=3+2
		 * i=5   5<8 true sout(5) i= i+2   i=5+2
		 * i=7  7<8 true sout(7) i=i+2   i=7+2
		 * i=9 9<8 false
		 */
		int i = 1;
		while (i < 8) {
			System.out.println(i);
			//i = i + 2;//循环条件
			i += 2;
		}
	}

}

```

> 案例:打印1-100以内的能被7整除的数

```Java
package com.qfedu.a_test;

public class Demo8 {
	public static void main(String[] args) {
		int i = 1;
		while (i < 101) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}

```

回顾上午的内容

```
1.三目运算符
数据类型  x = 表达式 ？ value1 : value2;
2.while循环
while (布尔表达式) {
	循环体
}

```

#### 2.3do-while【几乎不用】

> 语法格式:
>
> ```java
> do {
> 	语句体
> } while (布尔表达式);
> ```
>
> 执行流程:代码 执行到do的时候，就会执行语句体，然后再判断while后面的布尔表达式。如果布尔表达式为false的话，循环结束了。如果布尔表达式为true的话，再次回到do去执行语句体。

```Java
package com.qfedu.a_test;

public class Demo9 {

	public static void main(String[] args) {
		//打印3遍的晚上加班
		
		/**
		 * i = 0  第一个打印sout("晚上加班") i++   1<2 true
		 * 			打印第二个sout("晚上加班") i++  2<2 false
		 * 	循环结束 
		 * 		
		 */
		int i = 0;
		do {
			System.out.println("晚上加班");
			//i++放在了  布尔表达式的前面
			i++;
		} while (i < 3);
		
		
	}
}

```

while循环和do-while区别：

```
while循环先判断，如果为false，循环体不执行
do-while 循环 先执行一次，然后再判断表达式
```

#### 2.4for循环【重点】

> 语法格式：
>
> ```java 
> for (表达式1; 表达式2; 表达式3) {
>     循环体;
> }
> ```
>
> 表达式1:初始化的条件
>
> 表达式2:终止条件
>
> 表达式3:循环条件
>
> 执行流程:  先执行表达式1，在去判断表达式2 是否为true，如果为true执行循环体。然后再执行表达式3。再次回到表达式2进行判断，如果为true，再执行循环体，然后再执行表达式3。再回到表达式2，如果为false。就直接结束循环。

```Java
package com.qfedu.a_test;

public class Demo10 {
	public static void main(String[] args) {
		//打印3遍的 云想衣裳花想容
		/**
		 * i=0  0<3 true 就去执行大括号里面的代码  sout("云想衣裳花想容") i++
		 * i=1  1<3 true 打印第二遍的sout（"云想衣裳花想容"） i++
		 * i=2  2<3 true 打印第三遍的sout("云想衣裳花想容") i++
		 * i=3  3<3 false循环结束
		 */
		for (int i = 0; i < 3; i++) {
			System.out.println("云想衣裳花想容");
		}
	}

}

```

> 案例1：打印1-10以内的奇数

```Java
package com.qfedu.a_test;

public class Demo12 {
	public static void main(String[] args) {
		//打印1-10之间的奇数
		/**
		 * i=1 1<11 true 1%2==1 true sout(1) i++
		 * i=2 2<11 true 2%2==1 false i++
		 * i=3 3<11 true 3%2==1 true sout(3) i++
		 * i=4 4<11 true 4%2==1 false i++
		 * ......
		 */
//		for (int i = 1; i < 11; i++) {
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
//			
//		}
		/**
		 * i=1 1<11 sout(1) i=i+2 
		 * i=3 3<11 sout(3) i=i+2
		 * i=5  5<11 sout(5) i=i+2
		 * ...
		 */
		for (int i = 1; i < 11; i+=2) {
			System.out.println(i);
		}
	}

}

```

> 案例:
>
> 打印100以内的偶数

```Java
package com.qfedu.a_test;

public class Demo13 {

	public static void main(String[] args) {
		//打印1-100以内的偶数
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}
}

```

> 案例:
>
> ​		100以内的逢7过
>
> ​		凡是7的倍数和带7 的都要给我打印"过"
>
> ​		其他都是打印数字
>
> ​	分为两种情况:
>
> ​		1. 七的倍数
>
> ​			i % 7 ==0
>
> ​	    2.带7的
>
> ​				分为两种情况：
>
> ​					个位带7的： i % 10 == 7 
>
> ​					十位带7的:   i / 10 ==7

```Java
package com.qfedu.a_test;

public class Demo14 {
	public static void main(String[] args) {
		/**
		 * i=6 6<101 true sout(6) i++
		 * i=7 7<101 true sout("过") i++
		 * ......
		 */
		for (int i = 1; i < 101; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				System.out.println("过");
			} else {
				System.out.println(i);
			}
		}
	}

}

```

> 案例：求1-100数的和 1 +2 + 3+ ....+ 99 + 100

```java 
package com.qfedu.a_test;

public class Demo15 {
	public static void main(String[] args) {
		
		//求1-100数的和
		//要一个具体的数
		/**
		 * i=0 0<101 true sum = sum + i=>sum=0+0 i++
		 * i=1 1<101 true sum=sum+i=>sum=0 + 1 i++
		 * i=2 2<101 true sum=sum+i=>sum=0+1 +2 i++
		 * i=3 3<101 true sum=sum+i =>sum=0+1+2+3 i++
		 * i=4 4<101  ......=>sum = 0+1+2+3+4
		 * i=100 100<101..... sum=0+1+2+3+4+.... + 100
		 */
		int sum = 0;//初始化的值，是一个变量
		for (int i = 0; i < 101; i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
	}

}

```

#### 2.5循环的嵌套

> 一个循环里面再套另外一个循环
>
> 秉承着一点:   外部循环进入倒内存循环以后先把内部循环结束以后再进入倒外部的循环

> 需求:
>
> ​		
>
> ```
> *****
> *****
> *****
> ```
>
> 

```Java
package com.qfedu.a_test;

public class Demo16 {

	public static void main(String[] args) {
		//System.out.println("*****");
		/**
		 * i=0 0<5 true 打印* i++
		 * i=1 1<5 true 打印** i++
		 * i=2 2>5 true 打印*** i++
		 * ...
		 * 打印*****
		 */
//		for (int i = 0; i < 5; i++) {
//			System.out.print("*");
//		}
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		/**
		 * 一定要把执行流程弄清楚
		 * i=0 0<3 true 执行外层循环后面大括号的代码
		 * 		进入到了内层循环了
		 * 		j=0 0<5 true 打印* j++
		 * 		j=1 1<5 true 打印** j++
		 * 		j=2 2<5 true 打印*** j++
		 * 		j=3 3<5 true 打印**** j++
		 * 		j=4 4<5 true 打印***** j++
		 * 		j=5 5<5 false 内层的循环结束  换行 i++
		 * i=1 1<3 true 进入到内层for循环了
		 * 		j=0 0<5 true 打印* j++  在第二行打印的
		 * 		j=1 1<5 true 打印** j++  
		 * 		j=2 2<5 true打印*** j++
		 * 		j=3 3<5 true 打印**** j++
		 * 		j=4 4<5 true 打印***** j++
		 * 		j=5 5<5 false  内层循环结束  换行 i++
		 * 
		 * i=2 2<3 true 进入内层循环
		 * 		j=0
		 * 告知我一个规律:最外层的循环控制的是行
		 * 				 最内层循环控制的是列
		 * 		id  name  age  info
		 * 		1    狗蛋    67    像老邢
		 * 		2    老邢     89   像狗蛋
		 * 		3    骚磊    78    臀大
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();//换行
		}
	}
}

```

> 需求:
>
> ```
> *            第一行  1个*    (2 * i) - 1
> ***          第二行  3个*
> *****		第三行   5个*
> *******     第四行   7个*
> ```
>
> 注意事项:这种情况，列和你的行是有关系的
>
> i =>1  2  3  4
>
> j=> (2 * i) - 1

```java 
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

```

> 需求：
>
> ```
> 打印九九乘法表
> 1*1=1
> 1*2=2  2*2=4
> 1*3=3  2*3=6 3*3=9
> 1*4=4  2*4=8 3*4=12 4*4=16
> 
> ```

```java 
package com.qfedu.a_test;

public class Demo18 {
	public static void main(String[] args) {
		//留给你们分析执行流程！！！！
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();//换行
		}
	}

}

```

作业：

```
1.一周的总结  必须写在md文档上面【重点】
2.金山打字通
3.今天的东西 代码依旧是三遍。要弄懂为止！！！【重点】
4.我会发一些关于分支和循环的作业  周一抽人检查！！！
```

