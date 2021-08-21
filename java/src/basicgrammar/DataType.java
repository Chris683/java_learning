package basicgrammar;
/*

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
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
* */
/**
 * @author Chris
 * @create 2021-07-01-22:33
 */
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
public class DataType {
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
        int a = '1';
        System.out.println(a);
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
