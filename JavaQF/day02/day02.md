```
1.dos命令
	dir  显示当前文件夹下面的所有的文件和文件夹
	cd 切换目录的
	mkdir  创建文件夹的
	rd 删除文件夹的
	del 删除文件
	D:  切换盘符
	cls  清屏
	
2.书写Java代码换行打印《静夜诗》这首古诗
	class Demo1 {
		public static void main (String[] args) {
			System.out.println("");
		} 
	}
3.Java中的注释
	三个：
		单行注释  //
		多行注释
		文档注释
4.使用notepad++打印中文乱码怎么解决
	找到notepad++编码按钮  点击转为ANSI编码
```

### 今天的内容

> 1.安装eclipse
>
> 2.数据存储的方式【了解】
>
> 3.常量【了解】
>
> 4.变量【重点】
>
> 5.运算符【重点】

### 1.eclipse的安装

> Java的开发工具
>
> 将我发给大家的eclipse的安装包解压以后放到任意盘符下面，找到eclipse.exe文件双击运行即可

![1](img\1.png)

新建项目

File->new->project->java project->next

设置eclipse的字体的大小

![1](img\3.png)

eclipse设置自动补全

![4](img\4.png)



练习:

```
使用eclipse创建Java工程，并打印一个古诗词望庐山瀑布
```

### 2.数据存储的方式【了解】

#### 2.1数据的存储的基本单位【了解】

> 计算机存储的最小的单位 是字节（byte）
>
> 1024 byte = 1KB
>
> 1024 KB = 1MB
>
> 1024MB = 1GB
>
> 1024GB = 1TB
>
> 1024TB = 1PB
>
> 1024PB = 1EB

#### 2.2常见的进制单位【了解】

| 进制单位 | 基数范围 | 规则    |
| -------- | -------- | ------- |
| 二进制   | 0-1      | 逢2进1  |
| 八进制   | 0-7      | 逢8进1  |
| 十进制   | 0-9      | 逢10进1 |
| 十六进制 | 0-9  a-f | 逢16进1 |

```
二进制：
	0（0） 1（1） 2（10） 3（11） 4 （100） 5（101）...
八进制:
	0 (0)  1(1)....7(7) 8(10) 9 (11) 10 (12) ...
十进制:
	生活中都是十进制的  数学中都是十进制的
十六进制:
	0(0)  ....9(9) 10(a) 11(b)12 (c) ...15(f) 16(10)
进制之间的转换千万不要自己算:
	1.使用计算器
	2.Jav代码中封装的有方法来进行进制的转换
	3.在线进制转换网站
	很少使用，学会使用计算器
```

### 3.常量【了解】

> 生活中不可改变的叫常量
>
> pi    e   一天24小时    给大家说一下常量目的是为了引出来变量
>
> 按照生活习惯来说:
>
> ​		常量可以分为哪些种类:
>
> ​			整数: 7天   24小数
>
> ​			小数: pi   g    e
>
> ​			字符: '男'   '女'
>
> ​			字符串:   "那就回家睡觉"
>
> ​			真假关系:  true  false

### 4.变量【重点】

> 必须会写变量，并且知道变量的一些细节

#### 4.1生活中的变量

> 体重
>
> 工资
>
> 温度
>
> x + y = 10

#### 4.2java代码中的变量

> 定义：在程序运行过程中，可以改变的量叫变量。主要的目的是为了存储数据的
>
> 定义语法格式:
>
> ​		数据类型  变量的名字 = 初始化的值;
>
> ​		数据类型:其实就是对数据的分类
>
> ​		变量的名字：自己定义的命名的
>
> ​		=:赋值号
>
> ​		初始化的值：就是咱们存储的数据
>
> ​		Java中声明变量的时候，从右往左看。
>
> ​		int a = 10;   将10 赋值给变量a
>
> ​		宾馆的房间-》变量
>
> ​		房间的名字 -》变量名字
>
> ​		入住的房间-》值
>
> ​		房间的类型-》数据类型

```Java
package com.qfedu.a_test;

public class Demo2 {
	public static void main(String[] args) {
		//数据类型  变量的名字 = 初始化的值;
		int a = 10;//将10赋值给变量a了
		//拿a去进行操作
		System.out.println(a);//10
		a = 20;//将20赋值给了 a
		System.out.println(a);//20
		//其他的声明方式，了解层次的
		int b;//将变量的名字先定义出来。，然后再赋值
		b = 20;
		int c,d;//一次性定义两个变量
		
	}

}

```

#### 4.3数据类型【重点】

> Java有八大基本数据类型:
>
> 整型:  4个   byte  short  int  long	
>
> 小数（浮点数）:  2个   float   double 	
>
> 字符:   1个   char
>
> 布尔类型:  1个  boolean  
>
> 熟悉八大基本数据类型的关键字。！！！

```java 
package com.qfedu.a_test;

//类的首字母大写的
public class Demo3 {

	public static void main(String[] args) {
		//声明一个整型的变量  byte类型的数据
		//数据类型  变量名字 = 初始化的值;
		byte b = 12;
		System.out.println(b);
		//声明一个整型的变量  short 类型的数据
		short s = 67;
		System.out.println(s);
		//声明一个整型的变量  int 类型的数据
		int i = 89;
		System.out.println(i);
		//声明一个整型的变量  long 类型的数据
		long l = 89;
		System.out.println(l);
		//声明一个浮点（小数）类型的数据  float类型
		float f1 = 89.9f;
		System.out.println(f1);
		//声明一个字符类型的数据,使用的单引号，而且单引号里面只能有一个元素
		
		char c1 = '狗';
		System.out.println(c1);
		//声明一个布尔类型的数据,只有两个值 true  false
		
		boolean b1 = true;
		System.out.println(b1);
		
	}
}
```

#### 4.4整型类型的数据

| 整型                              | 数据范围     | 占用内存的字节 |
| --------------------------------- | ------------ | -------------- |
| byte                              | -128~127     | 1字节          |
| short                             | -32768~32767 | 2字节          |
| int【Java中默认的整型的数据类型】 | -2^31~2^31-1 | 4字节          |
| long                              | -2^63~2^63-1 | 8字节          |

注意事项:

```
声明long类型数据的时候，后面需要加L或者l
```

总结:

```
开发中只用int,  byte 和long 用的不多。  short  压根就不用
```

#### 4.5浮点类型的数据

| 数据类型                               | 数据范围                     | 占用的字节数 |
| -------------------------------------- | ---------------------------- | ------------ |
| float                                  | -3.4* 10^38~  3.4*10^38      | 4字节        |
| double（Java默认的是double类型的数据） | -1.79*10^308 ~ 1.79 * 10^308 | 8字节        |

注意事项：

```
1.声明float类型的数据的时候加f或者F
2.double类型的数据的有效位数 15~16
3.float类型的数据有效位数是 6~7
```

```Java
package com.qfedu.a_test;

public class Demo5 {
	public static void main(String[] args) {
		
		//double类型的数据
		double d1 = 3.4;
		System.out.println(d1);
		//在声明float类型的数据的时候一定加f或者F
		float f1 = 4.5f;
		//double类型的数据 有效位数 是15-16位
		double d2 = 82.121212121212122622;
		System.out.println(d2);
		double d3 = 4.352356789213451212;
		System.out.println(d3);
		//float类型的有效的位数6-7位
		float f2 = 8.272802111238383f;
		System.out.println(f2);
	}

}

```

#### 4.6字符类型

| 数据类型 | 数据范围                  | 占用的字节数 |
| -------- | ------------------------- | ------------ |
| char     | 除了\  都可以当成一个字符 | 不定的       |

> 注意事项：
>
> 声明char类型的数据的时候，使用单引号声明。并且单引号里面只能放一个元素

```Java
package com.qfedu.a_test;

public class Demo6 {
	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println(c1);
		char c2 = '3';
		char c3 = '中';
		char c4 = '&';
		//\是转义字符 不能当成一个字符来看
		//char c5 = '\';
	}

}

```

#### 4.7布尔类型

| 数据类型 | 数据范围      | 占用字节数 |
| -------- | ------------- | ---------- |
| boolean  | true或者false | 1字节      |

```Java
package com.qfedu.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//声明一个布尔类型的数据
		boolean b1 = true;
		System.out.println(b1);//true
		boolean b2 = false;
		System.out.println(b2);//false
	}
}

```

总结：

```
int类型
char类型
boolean类型
double 类型
会声明这四种数据类型，就证明你今天已经学会了
数据类型   变量名字 = 初始化的值;
```

#### 4.8变量的名字命名规范【默写的】

> 命名规范：
>
> ​		在真实的开发中，对接口，抽象类，类，变量，方法等会有一定命名规范

##### 4.8.1类名的命名规范

> 1.首字母要大写
>
> 2.以数字，字母，_，等命名，但是数字不能开头
>
> 3.采用大驼峰的命名规则，当一个类由两个单词组成的这两个单词的首字母要大写的
>
> ​		HelloWorld

##### 4.8.2变量的命名规范

> 1.首字母小写
>
> 2.以数字，字母，_，等组成，但是数字不能开头
>
> 3.采用小驼峰命名规则，当一个变量由两个单词组成的时候，后面的单词要大写
>
> ​	或者采用多个单词中间使用下划线进行拼接的一种写法
>
> ​		int userAge = 23;
>
> 4.命名见名知意
>
> ​		product_id     product_name     productName
>
> 5.已经被Java使用的关键字不能再作为变量的名字了

### 5.转义字符【重点】

> 目的：将无意义的字符转为有意义的字符或者将有意义的字符转为无意义的字符
>
> 语法格式:
>
> ​		\字符
>
> ​		几个特殊的符号:（只能在字符串中使用）
>
> ​				\n:回车换行
>
> ​				\t:制表符  空格

```Java
package com.qfedu.a_test;

public class Demo7 {
	public static void main(String[] args) {
		//打印一个字符类型的数据   '
		//\'将'转为一个无意义的字符
		System.out.println('\'');
		//打印一个字符类型的\
		System.out.println('\\');
		//打印一个字符串 "
		System.out.println("\"");
		//打印一个字符串 \
		System.out.println("\\");
		//打印一个字符串 \\
		System.out.println("\\\\");
		//\n
		System.out.println("巴萨不仅仅\n是今年是解决");
		System.out.println("是南京南京\t叫撒解决");
		
	}

}

```

### 6.运算符【重点】

> 1.算术运算符
>
> 2.关系运算符
>
> 3.逻辑运算符

#### 6.1算术运算符

> 数学中的  + （加） - （减） *(乘)  / (除)   %（取余）
>
> 先乘除后加减，有括号先算括号里面的

```Java
package com.qfedu.a_test;

public class Demo9 {
	public static void main(String[] args) {
		//加
		int num1 = 20;  //20赋值给num1
		int num2 = 10;//将10 赋值给num2
		//num1 = 20 + 10;
		//num1是变量 可以变化的量
		
		num1 =  num1 + num2;
		System.out.println(num1);//30
		//减
		int num3 = num1 - num2;
		System.out.println(num3);//20
		int a = 5;
		int b = 3;
		a = a * b;
		System.out.println(b);//3
		System.out.println(a);//15
		//除
		//注意 在Java中除法不能有小数点  取商整数
		int c = 2;
		c = b / c;//3/2
		System.out.println(c);//1
		//取余
		int d = 6;
		d = a % d;//15 % 6
		System.out.println(d);//3
		//先乘除后加减
		//1 + 3 * 3
		int e = c + d * b;
		System.out.println(e);//10
		//先算小括号里面的
		int f = (c + d) * b;
		System.out.println(f);
		
	}

}

```

扩展知识点

```Java
package com.qfedu.a_test;

public class Demo10 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		//=要先看右边  将右边值赋值给左边
		//num1 = num1 + num2;
		//简写的情况
		//num1 + num2 然后 在= 赋值 给谁啊 =左边的
		//
		num1 += num2;
		System.out.println(num1);//30
		int c;
		c = num1 + num2;//不能简写
		//以此类推  -=   *=  /=   %=  都有
		//num1 = num1 % num2;
		num1 %= num2;
		System.out.println(num1);//10
		
	}

}

```

自增和自减

> 目的：一个变量自身加1或者减1
>
> 语法格式：
>
> ```
> 变量++; 先执行当前的操作，再自身加1
> ++变量;先自身加1,然后再执行当前的操作
> 变量--;先执行当前的操作，再自身减1
> --变量;先减1,再执行操作
> ```

```java
package com.qfedu.a_test;

public class Demo11 {
	public static void main(String[] args) {
		int num1 = 10;
		//num1++ 先执行当前的操作，再自身加1
		System.out.println(num1++);//10
		System.out.println(num1);//11
		int num2 = 5;
		//++num2  先自身加1 ，然后执行其他的操作
		System.out.println(++num2);//6
		System.out.println(num2);//6
		
		int num4 = 3;
		int ret = num4++ * num4;
		System.out.println(ret);//12
		System.out.println(num4);//4
		
		int num5 = 2;
		int ret1 = num5  * ++num5;
		System.out.println(ret1);//6
		System.out.println(num5);//3
		
	}
	

}

```



```java 
作业1：
int i = 3;
int a = -(i++);
sout(a);
sout(i);


int i = 5;
int a;
a = i++ + i++ + i++;
sout(a);
sout(i);
    
int a;
int i = 5;
a = ++i + (++i) + (i++) + (i++);
sout(a);
sout(i);
    
 作业2:
	从变量开始
       你自己列一个纲要，看着纲要 然后自己去笔记补充完整， 不要看我的 笔记和代码，脑子里里面要装自己的东西
  作业3:
	预习视频第三天的东西
        
```

扩展：

声明一个字符串类型的数据

String不是基本数据类型， 是引用数据类型

语法格式：

```
String 变量名字 = "内容";
```

```java 
package com.qfedu.a_test;

public class Demo8 {
	public static void main(String[] args) {
		//数据类型 变量名字 = 初始化的值;
		String str = "一行白鹭上青天";
		System.out.println(str);
		
		//字符串拼接
		String name1 = "老邢";
		String name2 = "骚磊";
		System.out.println(name1 + "爱" + name2);
		int age = 89;
		System.out.println(name1 + age);//老邢89
		boolean b1 = true;
		System.out.println(name2 + b1);//骚磊true
		//一个字符串可以和任意的基本数据类型进行拼接
	}

}

```

