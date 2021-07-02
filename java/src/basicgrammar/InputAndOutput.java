package basicgrammar;

import java.util.Scanner;

/**
 * @author Chris
 * @create 2021-07-01-22:37
 */
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
public class InputAndOutput {
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
