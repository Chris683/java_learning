package FaceObject;

/**
 * @author Chris
 * @create 2021-07-12-17:17
 */

/**
 * 1.Java类及类的成员：属性、方法、构造器；代码块、内部类
 *
 * 2.面向对象中两个重要的概念：
 * 类：对一类事物的描述，是抽象的、概念上的定义
 * 对象：是实际存在的该类事物的每个个体，因而也称为实例(instance)
 *   >面向对象程序设计的重点是类的设计
 *   >设计类，就是设计类的成员。
 *
 * 二者的关系：对象，是由类new出来的，派生出来的
 */
class Person1 {
    //属性
    String name;
    int age = 1;

    // 构造器
    public Person1(){
    }

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }

    // 块
    {
        System.out.println("人可以睡觉");
    }

    // 内部类
    class Brain{

    }
}

class PersonText{
    public static void main(String[] args) {
        Person1 p =new Person1();               // 构建对象
        p.name = "chris";                     // 通过对象.属性，对象.方法调用对象结构
        System.out.println(p.name);
        System.out.println(p.age);
        p.eat();
    }

}