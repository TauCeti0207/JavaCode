```
1.switch后面的小括号里面的  数据类型是那种数据类型
	int  byte  short  String  char enum
2.if-else的语法格式
	if (布尔表达式) {
		语句体1
	} else {
		语句体2
	}
3.switch-case的语法格式
	switch () {
		case 常量1:
			语句体1;
			break;
		case 常量2:
			语句体2;
			break;
		defautl:
			语句体n;
			
	}
	
4.逻辑的短路原则
	逻辑与的短路原则:当条件为false的时候，后面条件就不再执行了
	逻辑或的短路原则:当条件为true的时候，后面条件就不再执行了
5.while循环的语法格式及执行流程
	while (布尔表达式) {
		循环体;
	}
	执行流程:  当布尔表达式为true的时候，执行循环体，再次回到while关键字，再次判断布尔表达式。如果表达式为false的话，循环结束
6.while和do-while的循环的区别
	while先判断表达式是否为true或者false，再决定是否执行循环体。但是do-while先执行一次循环体。
7.for循环的语法格式和执行流程
	for (表达式1; 表达式2; 表达式3) {
		循环体
	}
	执行流程:  先执行表达式1然后再判断表达式2，如果表达式2为true，就会执行循环体，执行表达式3，再次回到表达式2进行判断.....
8.使用for循环打印99乘法表
	for (int i = 1; i <= 9; i++)  {
		for (int j = 1; j <= i; ) {
		 System.out.print(j + "*" + i + "=" + i*j);
		}
		System.out.println();
	}



```

```
循环体
1.
   *   第一行  3个空格  1个*  2* i-1
  ***  第二行  2个空格  3个*
 ***** 第三行  1个空格 5个*
******* 第四行 0个空格 7个*

2.
*******
*****
***
*
3.
     *
    **
   ***
  ****
 *****
```

```java 
package com.qfed.a_for;

public class Demo1 {

	public static void main(String[] args) {
		/**
		 * i=1 1<5 true 
		 * 		进入到内层第一个for循环
		 * 		j=1 1<=3 true 打印第一个空格 j++
		 * 		j=2 2<=3 true 打印第二个空格 j++
		 * 		j=3 3<=3 true 打印第3个空格 j++
		 * 		j=4 4<=3 false 循环结束
		 * 		进入倒内层的第二个for循环
		 * 		k=1 1<=1 打印第一个* k++
		 * 		k=2 2<=1 false 循环 结束 换行 i++
		 * i=2...
		 * 	
		 * 	
		 * 	
		 */
		for (int i = 1; i < 5; i++) {//控制是行数  
			
			for (int j = 1; j <= 4 - i; j++) {//打印的空格的列
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {//打印*这个列
				System.out.print("*");
				
			}
			System.out.println();//换行
		}
	}
}

```

```java 
package com.qfed.a_for;

public class Demo2 {
	public static void main(String[] args) {
		//打印倒的直角三角形
		//学会自习分析
		for (int i = 4; i > 0; i--) {
			for (int j =1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

```

```java 
package com.qfed.a_for;

public class Demo3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {//控制行数
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

```

### 今天的内容

> 方法
>
> 方法会贯穿咱们整个职业生涯

### 1.方法【重点】

#### 1.1为什么要有方法

> 开发中如果出现了大量的重复的代码，或者是重复的功能，循环满足不了咱们的需求了。
>
> 可以使用方法
>
> 1.代码臃肿
>
> 2.可读性差
>
> 3.维护性差
>
> 建议用方法即可

#### 1.2其实已经见过方法

```java 
public static void main (String args) {
	方法体
}
这个方法是Java给咱们提供好的
    方法的名字叫main
    public static :  不要问
    void ：返回值   空的  没有返回值的
    main:  就是方法的名字
        方法的名字的命名和变量的命名一样。
        1.首字母小写
        2.使用数字，字母，下划线 ,$等组成的，但是数字不能开头
        3.使用小驼峰，命名规则，或者使用下划线进行拼接
        4.见名知意
        5.不能使用Java的关键字
     main的后面跟了一个小括号
     小括号中可以带参数
     小括号后面跟着的是一个大括号
     
        学会抄
```

#### 1.3定义方法的语法格式

> 无参无返回值的方法
>
> 有参无返回值的方法
>
> 无参有返回值的方法
>
> 有参有返回值的方法

##### 1.3.1无参无返回值的方法

> 语法格式：
>
> ```java 
> public  static void 方法的名字 () {
> 	方法体;
> } 
> ```
>
> 注意事项:
>
> ​	1.方法的声明必须在类中，在main主函数外面。
>
> ​	2.方法的调用必须在主函数中，使用的是方法的名字来调用的

```Java
package com.qfed.b_method;

public class Demo2 {
	
	public static void main(String[] args) {
		//在main主函数调用方法
		//
		printEat();
		printEat();
	}
	//在main方法的外部声明一个新的方法
	//无参 无返回值的方法
	public static void printEat () {
		for (int i = 0; i < 10; i++) {
			System.out.println("中午吃梅菜扣肉");
		}
	}
	

}

```

> 练习:写一个方法，打印出来99乘法表，使用无参无返回值的方法

```Java
package com.qfed.b_method;

public class Demo3 {
	public static void main(String[] args) {
		printNineNineTable();
		printNineNineTable();
	}
	public static void printNineNineTable () {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i);
			} 
			System.out.println();
		}
	}

}

```

> 练习:逢7过，使用方法的写法

```Java
package com.qfed.b_method;

public class Demo3 {
	public static void main(String[] args) {
		printNineNineTable();
		//printNineNineTable();
		printPassSeven();
	}
	public static void printNineNineTable () {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i);
			} 
			System.out.println();
		}
	}
	//逢7过
	public static void printPassSeven () {
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

总结：

```
1.新建一个类
2.在类中书写main主函数
3.在main主函数的外面写一个方法
4.在main主函数调用方法
```

##### 1.3.2有参无返回值的方法

> 语法格式:
>
> ```java 
> public static void 方法的名字 (数据类型 参数名字, 数据类型 参数名字, ...) {
>     方法体;
> }
> ```
>
> 注意事项:
>
> ​	1.方法的声明处的参数是形参。方法的调用处是实参
>
> ​		实参赋值给形参
>
> ​	2.方法在调用的时候一定要注意方法声明处形参的数据类型，是一一对应的关系

```java 
package com.qfed.b_method;

public class Demo4 {
	public static void main(String[] args) {
		printHello(8);
		//在方法额调用处  18啥意思？
		//18是实际参数 又叫实参  会讲实参赋值给形参，让形参具备真实的意义
		
		//将18赋值给方法的声明处的那个变量   num
	}
	//打印4遍的hello
	//此时方法的声明处 int  num  是形式参数  又叫形参
	//只是一个形式而已
	public static void printHello (int a) {
		for (int i = 0; i < a; i++) {
			System.out.println("hello");
		}
	}

}

```

```java 
package com.qfed.b_method;

public class Demo5 {
	public static void main(String[] args) {
		add(5, 6);
		//将5赋值给a  将6 赋值给 b
		addDouble(45.3, 566.9, 89.3);
		printStr("大漠孤烟直");
		concate("落霞与孤鹜齐飞,", "秋水共长天一色");
		print1(1,  "狗蛋", 2.3, 'a');
	}
	//打印两个int类型数据的和
	//a  和 b  是形式参数，是占着位置的变量
	public static void add (int a, int b) {
		System.out.println(a + b);
	}
	//打印3个doule数据类型的和
	public static void addDouble (double d1, double d2, double d3) {
		System.out.println(d1 + d2 + d3);
	}
	//打印一个字符串
	public static void printStr (String str) {
		System.out.println(str);
	}
	//字符串拼接
	public static void concate (String str1, String str2) {
		System.out.println(str1 + str2);
	}
	//参数类型是不一致的情况
	public static void print1 (int i1,  String str1,double d1, char c1) {
		System.out.println(i1 +  str1 + d1 + c1 );
		
	}

}

```

```java 
package com.qfed.b_method;

public class Demo6 {
	public static void main(String[] args) {
		printChengFaBiao(100);
	}
	public static void printChengFaBiao (int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i);
			}
			System.out.println();
		}
	}

}

```

上午回顾

```
1.无参无返回值的方法
public  static void  方法的名字() {
	方法体
}
2.有参无返回值的方法
public static void 方法的名字 (数据类型 形参, 数据类型 形参, ....) {
	
}
调用的时候在main主函数中 使用方法名字来调用即可。
```

##### 1.3.3无参有返回值的方法

> 语法格式：
>
> ```java 
> public static 数据类型 方法的名字 () {
>     return 返回值;//这个返回值的数据类型必须和方法的声明的地方的数据类型保持一致
> }
> ```
>
> 注意事项:
>
> ​	1.使用关键自 return
>
> ​	2.return的后面不能再写代码了
>
> ​	3.有返回值的方法在调用的时候，要将返回值的值是可以给一个变量的
>
> ​	4.无返回值的方法，只是打印一下而已。 是不能给一个变量的

```Java
package com.qfed.b_method;

public class Demo7 {
	public static void main(String[] args) {
		printNum();//这个只是单纯的打印显示而已
		int i1 = giveNum();//可以获取出来进行下一步的操作
		System.out.println(i1);
		//拿到值以后做下一步的操作
		System.out.println(i1 + 15);//20
		String string = giveString();
		System.out.println(string);
		
	}
	//定义一个方法，带有返回值的方法
	public static int giveNum () {
		//This method must return a result of type int
		return 5;
		
		
	} 
	public static void printNum () {
		System.out.println(5);
	}
	//返回值是字符串类型的数据
	public static String giveString () {
		String str = "你才觉得时间空间";
		return str;
	}

}

```

##### 1.3.4有参有返回值的方法

> 语法格式:
>
> ```java 
> public static 数据类型 方法的名字 (数据类型 形参, 数据类型 形参,...) {
>      return 返回值;
> }
> ```
>
> 

```java 
package com.qfed.b_method;

public class Demo8 {
	public static void main(String[] args) {
		int sum = add(3, 4, 5);
		System.out.println(sum);
		add1(3, 4, 5);
		System.out.println(judge(67.6, 89.8));//false
	}
	//求三个int类型数据的和  带有返回值的方法
	public static int add (int a, int b , int c) {
		return a + b + c;
	}
	public static void add1 (int a, int b, int c) {
		System.out.println(a + b + c);
	}
	//我现在脑海中有一个问题？这个形参和返回值类型有关系吗？
	//没有任何关系的
	//我想判断两个double类型的数据 如果 a 比 b大返回值一个true
	//反之返回false
	public static boolean judge (double a, double b) {
		if (a > b) {
			return true;
		} else {
			return false;
		}
	}
	

}

```

> 练习:
>
> 无参无返回值的方法:
>
> ```java 
> package com.qfed.b_method;
> 
> import java.util.Scanner;
> 
> public class Demo9 {
> 	public static void main(String[] args) {
> 		
> 		 String str = isOddOrEven1();
> 		 System.out.println(str);
> 	}
> 	//判断一个数是否是偶数和奇数,不带参数的
> 	//无参无返回值的方法
> 	public static void isOddOrEven () {
> 		Scanner scanner = new Scanner(System.in);
> 		System.out.println("请输入一个整数:");
> 		int i = scanner.nextInt();
> 		if (i % 2 == 0) {
> 			System.out.println("该数是偶数！！！");
> 		} else if (i % 2 == 1) {
> 			System.out.println("该数是奇数！！！");
> 		}
> 	}
> 	//无参有返回值的方法
> 	public static String isOddOrEven1 () {
> 		Scanner scanner = new Scanner(System.in);
> 		System.out.println("请输入一个整数:");
> 		int i = scanner.nextInt();
> 		if (i % 2 == 0) {
> 			return "该数是偶数!!!";
> 		} else {
> 			return "该数是奇数！！！";
> 		}
> 	}
> 
> }
> 
> ```
>
> ```java 
> package com.qfed.b_method;
> 
> import java.util.Scanner;
> 
> public class Demo10 {
> 	public static void main(String[] args) {
> 		Scanner scanner = new Scanner(System.in);
> 		System.out.println("请输入一个整数:");
> 		int i = scanner.nextInt();
> 		isOddOrEven(i);
> 	}
> 	//有参无返回值的方法
> 	public static void isOddOrEven (int a) {
> 		if (a % 2 == 0) {
> 			System.out.println("该数是偶数!!!");
> 		} else if (a % 2 == 1) {
> 			System.out.println("该数是奇数!!!");
> 		}
> 	}
> 
> }
> 
> ```
>
> 

总结：

```
1.无参数无返回值的方法
脑海里面必须有无参无返回值方法的语法格式
2.有参无返回值的方法
3.无参有返回值的方法
4.有参有返回值的方法

以后方法天天写！！！你现在不会，慢慢就带着会了
```

### 2.break和continue关键字

> 字面意思：
>
> ​		break： 终止 打断
>
> ​		continue:  继续

#### 2.1break;

> 语法格式:
>
> ```java 
> break;
> ```
>
> 注意事项:
>
> ​		break关键字 只能在switch-case中或者循环中使用

```Java
package com.qfed.c_breakandcontinue;

public class Demo1 {
	public static void main(String[] args) {
		//break;  终止打断的意思
		for (int i = 0; i < 5; i++) {
			System.out.println("嘻嘻哒");
			break;//终止 打断的意思
		}
		System.out.println("呵呵哒");
	}
}

```

```Java
package com.qfed.c_breakandcontinue;

public class Demo2 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);//5
				break;
			}
			System.out.println(i);//1  2   3  4
		}
	}
	//今天你们试一下   for循环里面使用switch-case
	//语法格式完全可以的，但是swicth-case里面的break;不会终止循环
	

}

```

#### 2.2continue;

> 语法格式:
>
> ```java 
> continue;
> ```
>
> 跳过本次循环，继续下一次的循环
>
> 只能在循环中使用

```Java
package com.qfed.c_breakandcontinue;

public class Demo4 {
	public static void main(String[] args) {
		/**
		 * i=4  4<8 true 4%5==0 false sout(4) i++
		 * i=5 5<8 true  5%5==0 true  continue 结束了本次循环 i++
		 * i=6 6<8 true 6%5==0 falsesout(6) i++
		 * i=7 7<8 true 7%5==0false sout(7) i++
		 * i=8 8<8循环结束
		 */
		for (int i = 4; i < 8; i++) {
			if (i % 5 == 0) {
				continue;//结束本次循环执行下次的循环
			}
			System.out.println(i);
		}
	}

}

```

> 1-100带7 的不打印，使用continue

```Java
package com.qfed.c_breakandcontinue;

public class Demo5 {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
				continue;
			}
			System.out.println(i);
		}
	}
}

```

### 3.案例关于方法的练习

> 1.写一个方法，找出两个int类型最大值，并输出打印最大值

```Java
package com.qfed.d_method;

public class Demo1 {
	public static void main(String[] args) {
		//max();
		//max1(89, 67);
		//System.out.println(max2());
		System.out.println(max3(150, 250));
	}
	//求两个int的最大值的
	//无参无返回值的方法
	public static void max () {
		int a,b;
		a = 45;
		b = 69;
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
	}
	//有参无返回值的方法
	public static void max1(int a, int b) {
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
	//无参有返回值的方法
	public static int max2 () {
		int a,b;
		a = 45;
		b = 32;
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	//有参有返回值的方法
	public  static int max3 (int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	

}

```

> 案例2：控制台输入一个字符，判断这个字符是否是大写的英文字符，如果是打印是大写的，如果不是打印不是大写的英文字符

```Java
package com.qfed.d_method;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		//控制台输入
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char c1 = scanner.next().charAt(0);
		System.out.println(isUpper(c1));
	}
	//判断一个字符是否是大写的字符
	public static String isUpper (char c1) {
		//if (c1 >= 'A' && c1 <= 'Z') {
		if (c1 >= 65 && c1 <= 90) {
			return "是大写的字母";
		} else {
			return "不是大写字母";
		}
	}

}

```

> 案例3:判断一个字符是否是数字字符

```Java
package com.qfed.d_method;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		isNumber();
	}
	//判断一个字符是否是数字字符
	public static void isNumber () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		char c1 = scanner.next().charAt(0);
		if (c1 >= '0' && c1 <= '9') {
			System.out.println("是数字字符");
		} else {
			System.out.println("不是数字字符");
		}
	}

}

```

今天作业:

```
1.今天的案例
	先列一个纲要，然后自己往里面。顺手把案例写上去即可【重要】
	
2.金山打字通
3.会给大家发一个zuoye.txt文档【次要的】
```

