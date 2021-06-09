/**
 * @author Chris
 * @create 2021-06-08-21:20
 */

//1 Java特点
/**
 * 简单性
 * 面向对象
 * 分布式
 * 健壮性
 * 安全性
 * 体系结构中立
 * 可移植性
 * 解释性
 * 高性能性
 * 多线程
 * 动态性
 */

// 2 第一个Java程序
// 2.1 public class 后面采用的类名和文件名保持一样，一个Java程序里面只有一个public class；
// 2.2 class后面类名必须以字母开头，后面可以跟字母和数字的任意组合；
// 2.3 System.out.println（）输出数据后换行；  System.out.print()输出数据；
public class java_grammar {
    public static void main(String[] args) {
        System.out.println("hello word!");
        System.out.print("hello");
        System.out.print(" word！");
    }
}

// 3 注释
// 单行注释
/*多行
注释*/
/**
 * 文档注释
 */

// 4 关键字
// 4.1 被Java语言赋予了特殊含义，用做专门用途的字符串（单词）；关键字中所有字母都为小写。

// 5 标识符
/*
定义：Java 对各种变量、方法和类等要素命名时使用的字符序列称为标识符
技巧：凡是自己可以起名字的地方都叫标识符
规则：由26个英文字母大小写，0-9 ，_或 $ 组成；数字不可以开头；不可以使用关键字和保留字，但能包含关键字和保留字；
Java中严格区分大小写，长度无限制；标识符不能包含空格。

命名规范：
包名：多单词组成时所有字母都小写：xxxyyyzzz
类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ
 */

// 5 变量与常量
// 5.1 基本类型
// 整数类型：byte(1字节)、short（2字节）、int(4字节)、long（8字节）
// 浮点类型：float(4字节)、double（8字节）
// 字符类型：char（2字节）
// 布尔类型：boolean
class DataType{
    public static void main(String[] args) {
        byte b = 1;
        System.out.println(b);
        short s = 200;
        System.out.println(s);
        int i = 300;
        System.out.println(i);
        long l = 400L;                         //java的整型常量默认为 int 型，声明long型常量须后加‘l’或‘L’
        System.out.println(l);
        char c = '中';                         //字符常量是用单引号(‘’)括起来的单个字符
        System.out.println(c);
        //byte b2 = 200; 该行会出现编译错误，因为200是int型，变量赋予超出其范围的值
        //char 只能存放一个字符，超过一个字符就会产生编译错误
        //char c2 = '中国'; 报错
        //char c3 = 'ab'; //报错
        double d = 123.45;
        System.out.println(d);
        //float f = 54.321;该行会出现编译错误，因为54.321是double型的
        float f2 = 54.321f;                     //Java 的浮点型常量默认为double型，声明float型常量，须后加‘f’或‘F’
        System.out.println(f2);
        boolean b1 = true;
        System.out.println(b1);
        boolean b2 = false;                     //boolean类型数据只允许取值true和false，无null。
        System.out.println(b2);
        String str = "Hello Java";              //String不是基本数据类型，属于引用数据类型，字符串是用双引号(“”)括起来的
        System.out.println(str);
    }
}
// 5.2 类型转换
// 自动转换，容量小的类型自动转换为容量大的数据类型。数据类型按容量大小排序为byte、short、char、int、long、float、double
// byte,short,char之间不会相互转换，他们三者在计算时首先转换为int类型
// boolean类型不能与其它数据类型运算
// 当把任何基本数据类型的值和字符串(String)进行连接运算时(+)，基本数据类型的值将自动转化为字符串(String)类型
// 强制类型转换，将容量大的数据类型转换为容量小的数据类型
class TypeConversion{
    public static void main(String[] args) {
        byte b = 5;
        int i = 6;
        System.out.println(i);
        int i1 = 10;
        int i2 = 300;
        i = b;
        System.out.println(i);                   //自动转换

        b = (byte) i1;                           //强制转换
        System.out.println(b);                   //因为i1的值是在byte范围之内，所以即便进行强制转换,最后得到的值，也是10

        //因为i2的值是在byte范围之外，所以就会按照byte的长度进行截取
        //i2的值是300，其对应的二进制数是 100101100
        //按照byte的长度8位进行截取后，其值为 00101100 即44
        b =(byte) i2;
        System.out.println(b);

        //查看一个整数对应的二进制的方法：
        System.out.println(Integer.toBinaryString(i2));
        System.out .println(3+4+"Hello!");         //输出：7Hello!
        System.out.println("Hello!"+3+4);          //输出：Hello!34
        System.out.println('a'+1+"Hello!");        //输出：98Hello!
        System.out.println("Hello"+'a'+1);         //输出：Helloa1
    }
}
// 5.3 final
// 当一个变量被final修饰的时候，该变量只有一次赋值的机会

// 6 运算符
/*
算术运算符:+ - * / % ++ --
赋值运算符:= += -= *= /= %=
比较运算符（关系运算符）:== != > < >= <=
逻辑运算符：&& || ！
位运算符：>> << ~ ^
三元运算符:(条件表达式)?表达式1：表达式2；
 */

