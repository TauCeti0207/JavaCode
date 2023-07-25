```
1.八大基本数据类型
	整型:  byte  short int long
	浮点:  float  double
	字符:  char
	布尔:  boolean
	
2.声明整型和浮点和布尔类型的数据  一个变量
	数据类型  变量名字 = 初始化的值;
	int a = 234;
	float f1 = 34.5f;
	double d1 = 782.9;
	boolean b1 = true;
	
	
	
3.变量名字的命名规范
	1.首字母要小写
	2.一般数字，字母，_组成的，但是数字不能开头
	3.小驼峰的命名规则，或者使用_连接多个单词
	4.见名知意
	5.不能使用Java的关键字 
4.++  在变量的前面和后面有什么区别
		++：在变量的后面，先执行当前的操作，然后再自身加1
		++:在变量前面，先自身加1，然后再执行其他操作
5.算术运算符有哪些
	+  -  *  /  %  += -=  *=  /=  %=  ++  --
6.转义字符
	\字符： 将有意义的字符转为无意义的字符或者将无意义的字符转为有意义的字符	
```

### 今天的内容

> 1.运算符
>
> 2.分支结构

### 1.运算符

> 1.算术运算符
>
> 2.关系运算符
>
> 3.逻辑运算符

#### 1.1关系运算符

```
> (大于)  < (小于)   >= (大于等于)  <=(小于等于)  == （是否等于） !=(是否不等于)
使用关系运算符的结果是一个布尔类型的数据 boolean
```

```Java
package com.qfedu.a_test;

public class Demo1 {
//类体
	public static void main(String[] args) {
		boolean ret = 3 >  4;
		System.out.println(ret);//false
		boolean ret1 = (4 > 2);
		System.out.println(ret1);//true
		boolean ret2 = 4 >= 4;
		System.out.println(ret2);//true
		boolean ret3 = 5 != 8;
		System.out.println(ret3);//true
		boolean ret4 = 4 == 5;
		System.out.println(ret4);//false
		
	}
}

```

#### 1.2逻辑运算符

返回值的结果也是一个布尔类型的数据

与  或  非

> 与：
>
> ​		&&
>
> 语法格式:
>
> ```
> 条件1 && 条件2  .....
> ```
>
> 条件就是咱们刚才讲的关系运算符的表达式
>
> 条件1 和条件2 都为true的时候，整体的结果就为true。
>
> 条件1和条件2只要有一个为false ，整体结果就为false。
>
> 逻辑与:
>
> ​		取钱： 卡  和 密码

```Java
package com.qfedu.a_test;

public class Demo2 {

	public static void main(String[] args) {
		boolean ret1 = 3 > 4 && 5 < 6;
		System.out.println(ret1);//false
		
		boolean ret2 = (4 > 3) && (3 > 2);
		System.out.println(ret2);//true
		
		boolean ret3 = (7 > 4) && (5 > 2) && (7 >1);
		System.out.println(ret3);//true
		
	}
}

```

> 或:
>
> ​	||
>
> 语法格式:
>
> ```
> 条件1 || 条件2 || .....
> ```
>
> 条件1和条件2 都为false的时候，才为false。如果一个条件为true，整体结果的就为true。
>
> 生活中的案例:
>
> ​		你有一把钥匙  你媳妇一把钥匙。 你的一把丢了  还可以开门 因为你媳妇是true
>
> ​		两个都丢了  两个都是false   整体就为false

```Java
package com.qfedu.a_test;

public class Demo3 {
	public static void main(String[] args) {
		//false || true  整体的结果就为true
		boolean ret1 = 3 > 4 || 5 > 3;
		System.out.println(ret1);//true
		
		boolean ret2 = 5 > 2 || 4 > 1 || 6 > 7;
		System.out.println(ret2);//true
		
	}

}

```

> 非:
>
> ​	！
>
> 语法格式:
>
> ​	
>
> ```
> ！条件
> ```
>
> 条件是true，那么整体结果就为false。  条件为false ，整体结果就是true。、
>
>  犟  反着来

```Java

		boolean ret3 = !(3 > 4);
		System.out.println(ret3);//true
```

```Java
package com.qfedu.a_test;

public class Demo4 {
	public static void main(String[] args) {
		// true && (false || true)
		boolean ret = (3 > 2) && ((4 > 5) || (5 > 2));
		System.out.println(ret);//true
		//false || true && false || false && false
		//true && false|| false && false
		//false || false && false
		//false && false
		//false
		//!false
		boolean ret1 = !((8 > 9) || (7 > 2) && (8 < 4) || (6 > 7) && (8 < 1));
		System.out.println(ret1);//true
		
		boolean ret2 = (8 > 9) || !((7 > 2) && (8 > 4)) && (10 > 1) || (9 < 4);
		System.out.println(ret2);//false
	}

}

```

#### 1.3逻辑运算符的短路原则

> 逻辑与的短路原则:
>
> ​		条件1 && 条件2 && 条件3......
>
> ​		逻辑与只要一个为false整体就为false了。
>
> ​		短路原则:只要碰到条件为false的话，后面的条件就不再执行了。
>
> ​		比如 条件1为false了，那么条件2和条件3就不执行了。想通一个问题，条件1为false的话，整体结果已经确定下了，咱们的jvm会有自动的识别能力，为了提高代码的运行的效率
>
> 逻辑或的短路原则:
>
> ​		条件1 || 条件2 || 条件3 ....
>
> ​		逻辑与只要一个为true 就整体为true
>
> ​		短路原则:只要条件为true的话，后面的条件就不再执行了。
>
> ​		比如条件1为true，那么条件2和条件3就不执行了。

```Java
package com.qfedu.a_test;

public class Demo5 {
	public static void main(String[] args) {
		//逻辑与短路原则
		int num = 10;
		//false && 
		boolean ret = (3 < 2) && (++num > 15) ;
		System.out.println(ret);//false
		System.out.println(num);//10
		
		//逻辑或的短路原则
		int num1 = 10;
		boolean ret1 = (3 > 2) || (++num1 > 10);
		System.out.println(ret1);//true
		System.out.println(num1);//10
		
		//
		int num2 = 10;
		//逻辑或在第一个的时候，如果条件1为true的话，后面的全部不执行了
		//一般开发中要么单独使用逻辑与要么单独使用逻辑或，不然太复杂了
		boolean ret2 = (3 > 2) || (++num2 > 15) && (3 > 2) && (++num2 > 20);
		System.out.println(ret2);//true
		System.out.println(num2);//10
		
	}

}

```

可以自己百度一下Java位运算符

总结：

```
算术运算符
关系运算符
逻辑运算符
```

### 2.分支结构【重点】

先学习语法格式和执行流程

> 生活中的分支:就是一种选择
>
> 程序中的分支：也是一种选择

#### 2.1if分支

> 语法格式:
>
> ```java 
> if (表达式) {
> 	语句体;
> }
> ```
>
> 表达式:这个表达式的结果必须是一个布尔类型的数据
>
> 执行流程:
>
> ​	如果代码走到if的时候，会先判断小括号里面表达式的结果。如果表达式的结果为true的话，就会执行大括号里面的语句体，如果表达式结果为false的话，就不执行大括号里面的语句体。代码往下继续执行。

```Java
package com.qfedu.a_test;

public class Demo6 {
	public static void main(String[] args) {
		int money = 10;
		//只有通过关系运算符和逻辑运算符得到的结果才能是一个布尔类型的数据
		
		if (money > 11) {
			System.out.println("你是一个富豪，要请吃饭的。");
		}
		System.out.println("代码快结束了哦");
	}

}

```

练习:用户名  111  密码  111 （int类型的数据） 使用if语句如果用户名和密码都对的话，打印一句话，登陆成功。

```Java
package com.qfedu.a_test;

public class Demo7 {
	public static void main(String[] args) {
//		int user = 111;
//		int password = 111;
//		if (user == 111 && password == 111) {
//			System.out.println("登陆成功");
//		}
		String user = "admin";
		String password = "123456";
		if (user == "admin" && password == "123456") {
			System.out.println("登陆成功");
		}
		System.out.println("执行代码");
	}

}

```

#### 2.2if-else分支

> 语法格式:
>
> ```java 
> if (表达式) {
> 	语句体1
> } else {
>     语句体2
> }
> ```
>
> 执行流程：首先判断b表达式，如果表达式为true的话，执行语句体1，如果为false的话，执行语句体2.两者不可兼得

```Java
package com.qfedu.a_test;

public class Demo8 {
	public static void main(String[] args) {
		int money = 20;
		if (money > 15) {
			System.out.println("中午吃大盘鸡拌面");
		} else {
			System.out.println("中午吃泡面");
		}
	}

}

```

> 案例:判断一个年份是否是闰年。
>
> 注意:能被4整除，并且不能被100整除,或者能被400整除的年份

```Java
package com.qfedu.a_test;

public class Demo9 {
	public static void main(String[] args) {
		//> 案例:判断一个年份是否是闰年。
		//>
		//> 注意:能被4整除，并且不能被100整除,或者能被400整除的年份
		int year = 2100;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
		
	}

}

```

#### 2.3if-else的嵌套写法

```Java
package com.qfedu.a_test;

public class Demo10 {
	public static void main(String[] args) {
		
		int num = 10;
		int num1 = 12;
		//if之间相互嵌套
		//10 > 8
		if (num > 8) {
			if (num1 > 20) {
				System.out.println("num1 大于了20");
			} else {
				System.out.println("num1小于20");
			}
		} else {
			System.out.println("num小于8");
		}
	}

}

```

今天上午

```
1.关系运算符
2.逻辑运算符
3.分支结构
	if分支
	if (表达式) {
		语句体
	}
	if-else 分支
	if (表达式) {
		语句体1
	} else {
		语句体2
	}
```

#### 2.4if-else if 分支结构

> 语法格式:
>
> ```Java
> if (表达式1) {
>     语句体1
> } else if (表达式2) {
>     语句体2;
> } else if (表达式3) {
>     语句体3
> } else if (表达式4) {
>     语句体4
> }else {
>     语句体n
> }
> ```
>
> 执行流程:
>
> ​	首先判断if后面的表达式1，如果表达式1为true，就执行当前大括号里面的语句体1，后面的代码就直接跳过了。如果表达式1为false，不执行语句体1，接着判断表达式2，如果为true，执行语句体2，以此类推。
>
> 总结：就是在判断表达式，一旦表达式为true的话，就执行当前的语句体，为false，就不执行的

```java 
package com.qfedu.a_test;

public class Demo11 {
	public static void main(String[] args) {
		/**
		 * 学生的成绩：
		 * 90-100:打印优秀
		 * 80-90：打印良好
		 * 70-80：打印一般
		 * 60-70：打印及格
		 * 60分以下:叫家长
		 */
		//if-else if
		int score = 180;//声明了一个成绩变量
		if (score > 100 || score < 0) {
			System.out.println("您书写的成绩有误！！！");
			//退出当前程序
			System.exit(0);
		}
		if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 80 ) {
			System.out.println("良好");
		} else if (score >= 70 ) {
			System.out.println("一般");
		} else if (score >= 60 ) {
			System.out.println("及格");
		} else {
			System.out.println("叫家长");
		}
	}

}

```

> 案例：
>
> ​	手机按键  
>
> 如果你按的是1   打印给爸爸打电话
>
> 如果你按的是2   打印给妈妈打电话
>
> 如果你按的是3   打印给爷爷打电话
>
> 如果你按的是4   打印给奶奶打电话
>
> 如果你按的是其他的   报警

```Java
package com.qfedu.a_test;

public class Demo12 {
	public static void main(String[] args) {
		
		// ctrl + shift + ?  多行注释的快捷键
		int num = 3;
		if (num == 1) {
			System.out.println("给爸爸打电话");
		} else if (num == 2) {
			System.out.println("给妈妈打电话");
		} else if (num == 3) {
			System.out.println("给爷爷打电话");
		} else if (num == 4) {
			System.out.println("给奶奶打电话");
		} else {
			System.out.println("报警");
		}
	}

}

```

#### 2.5swicth-case结构

> 也是一种分支结构，只有满足条件的时候才会执行的
>
> 语法格式:
>
> ```java 
> switch (表达式) {
>     case 常量1:
>         语句体1;
>         break;
>      case 常量2:
>         语句体2;
>         break;
>       case 常量3:
>         语句体3;
>         break;
>       ....
>       default:
>         语句体n;
>         break;
> }
> ```
>
> 执行流程:switc后面的小括号里面的表达式的值，去匹配case后面的常量，如果匹配到就执行:后面的语句体。下面就不执行了。
>
> 手机按键  
>
> 如果你按的是1   打印给爸爸打电话
>
> 如果你按的是2   打印给妈妈打电话
>
> 如果你按的是3   打印给爷爷打电话
>
> 如果你按的是4   打印给奶奶打电话
>
> 如果你按的是其他的   报警

```java
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

```

> 案例:
>
> /**
> 		 * 学生的成绩：
> 		 * 90-100:打印优秀   
> 		 
> 		* 80-90：打印良好
> 			
> 		 * 70-80：打印一般
> 			
> 		 * 60-70：打印及格
> 			
> 		 * 60分以下:叫家长
> 		 */
> 		 	
> 		 由于是swicth 表达式是一个值，所以得找规律
> 		 	
> 		 90~100 规律    int score  = 98;  

```java 
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

```

重点：

```
swicth (表达式) {

}
表达式的值可以是什么数据类型的
int  short  byte  char  String 枚举
```

```Java
package com.qfedu.a_test;

public class Demo17 {
	public static void main(String[] args) {
		//switch小括号里面是一个表达式
		//这个表达式是一个具体的一个值
		//那么就应该有对应的数据类型
		//那么这个表达式的数据类型应该是啥?
		//int  short  byte  char   
		//String  jdk1.8及以后的版本的
		//枚举
		//Cannot switch on a value of type long. 
		//Only convertible int values,
		//strings or enum variables are permitted
		//long num = 7;
		char c = 'b';
		String str = "中国";
		switch (str) {
		case "小日本":
			System.out.println("细细打");
			break;
		case "漂亮国":
			System.out.println("呵呵哒");
			break;
		case "中国":
			System.out.println("哈哈哒");
			break;
		case "泡菜国":
			System.out.println("今年夏季那是你");
			break;
		default:
			break;
		}
	}

}

```

总结：

```
1.if
2.if- else
3.if-else if
4.swicth-case
```

作业:

```
1.将今天至少三遍  写注释写上自己的见解
2.向昨天一样，写一个大纲
3.等我给大家发一个文档  作业文档
明天抽查
```



### 扩展知识点

> 咱们现在声明变量的时候是如何声明的？
>
> ​	int   a = 20;
>
> 直接对a进行赋值。
>
> 咱们还有一种方式对变量进行赋值。
>
> 通过控制台输入，然后交给代码中的某一个变量
>
> 1.导包
>
> ​	import java.util.Scanner;
>
> 2.创建Scanner对象
>
> ​	Scanner sc = new Scanner(System.in);
> 3.获取控制台中的数据
>
> 	//3.将控制台的输入的数据 赋值给咱们代码的一个变量
> 		int a = sc.nextInt();

```Java
package com.qfedu.a_test;

//1.导包
import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {
		//String str = "";
		//2.获取Scanner对象
		Scanner sc = new Scanner(System.in);
		//3.将控制台的输入的数据 赋值给咱们代码的一个变量
		int a = sc.nextInt();
		System.out.println("您输入的是:" + a);
	}

}

```

```Java
package com.qfedu.a_test;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//获取控制台里面的int类型的数据
//		int a = scanner.nextInt();
//		System.out.println("输入的是:" + a);
		//获取控制台里面float类型的数据
//		float f1 = scanner.nextFloat();
//		System.out.println("输入的是:" + f1);
		//获取控制台里面double类型的数据
//		double d1 = scanner.nextDouble();
//		System.out.println("输入的是:" + d1);
		//获取控制台里面boolean类型的数据
//		boolean b1 = scanner.nextBoolean();
//		System.out.println("输入的是:" + b1);
		//);
		//获取控制台里面String类型的数据
		//String str = scanner.next();
//		String str = scanner.nextLine();
//		System.out.println(str);
		//获取控制台里面char类型的数据
		//字符是在字符串的基础之上再取单个的字符
		char c1 = scanner.nextLine().charAt(2);//取第0个字符
		System.out.println(c1);
	}
}

```

