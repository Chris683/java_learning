/**
 * @author Chris
 * @create 2021-06-08-21:20
 */
import java.util.Scanner;

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
class HelloWord {
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


// 7 输入输出
// Scanner用法
// 导入包 import java.util.Scanner
// 实例化：Scanner scan = new Scanner(System.in);
// 调用Scanner类的相关方法获取指定类型
class ShuRu{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("年龄");
        int age =scan.nextInt();
        System.out.println(age);

        System.out.println("体重");
        double weight = scan.nextDouble();
        System.out.println(weight);

        double x = 1000/3.0;
        int a = 1235;
        String he = "hello word";
        System.out.println(a);
        System.out.println(x);
        System.out.printf("%d",a);
        System.out.println();
        System.out.printf("%d",a);
        System.out.println();
        System.out.printf("%x",a);
        System.out.println();
        System.out.printf("%s",he);
        System.out.println();
        //System.out.printf("%d",x);
        System.out.printf("%8.2f",x);
        System.out.println();
        System.out.printf("%,.2f",x);
        System.out.println();

    }
}

// 8 流程控制
class LiuChenKongZhi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("输入成绩：");
        int score = scan.nextInt();

        // if...else
        if (score>90){
            System.out.println("A");
        } else if (90 >= score && score>80){
            System.out.println("B");
        }else if (80 >= score && score>70){
            System.out.println("C");
        }else if (70 >= score && score>60){
            System.out.println("D");
        }else {
            System.out.println("不及格");
        }

        int day = 4;

        //switch
        switch(day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("这个是什么鬼？");
        }

        // while
        int number = 1;
        while (number<=7){
            System.out.println(number);
            number++;
        }
        // do while
        do{
            System.out.println(number);
            number++;
        }while (number<=7);

        // for
        for (int i = 0; i <7 ; i++) {
            System.out.println(i);
        }
        // continue
        for (int j = 1; j < 10; j++) {
            if(0==j%2)
                continue; //如果是双数，后面的代码不执行，直接进行下一次循环

            System.out.println(j);
        }
        // break
        for (int j = 1; j < 10; j++) {
            if(0==j%2)
                break; //如果是双数，结束当前循环

            System.out.println(j);
        }

    }
}

// 9 数组
class ShuZu{
    public static void main(String[] args) {
        // 9.1 声明和初始化
        int[] num;                                    //声明
        num = new int[]{1,2,3,4,5,6,7};               //静态初始化
        String[] names = new String[5];               //动态初始化

        //9.2 赋值
        names[0] = "xiaoming";                        //赋值
        names[1] = "nihao";
        names[2] = "wu";
        names[3] = "ni";
        names[4] = "hjk";

        //9.3 数组长度
        System.out.println(names.length);
        System.out.println(num.length);

        //9.4 遍历数组
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);
        }

        //9.5 二维数组
        int[][] arr = new int[][]{{1,2},{3,4,5},{6,7}};
        int[][] arr1 = new int[3][2];

        //9.6 调用二维数组元素
        System.out.println(arr[0][1]);
        System.out.println(arr1[0][1]);

        //9.7 二维数组的长度
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        //9.8  二维数组遍历
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // 9.9二维数组初始值
        System.out.println(arr1[0]);
        System.out.println(arr1[0][0]);


    }
}

class pin{
    public static void main(String[] args) {
        int a;
        a = (int) (3.9);
        System.out.println(a);
    }
}
