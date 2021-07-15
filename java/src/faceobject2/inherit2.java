package faceobject2;

/**
 * @author Chris
 * @create 2021-07-15-22:23
 */
/*
 * 方法的重写(override / overwrite)
 *
 * 1.重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作
 *
 * 2.应用：重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名同参数的方法时，实际执行的是子类重写父类的方法。
 *
 * 3. 重写的规定：
 * 			方法的声明： 权限修饰符  返回值类型  方法名(形参列表) throws 异常的类型{
 * 						//方法体
 * 					}
 * 			约定俗称：子类中的叫重写的方法，父类中的叫被重写的方法
 * 		① 子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同
 *      ② 子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符
 *      	>特殊情况：子类不能重写父类中声明为private权限的方法
 *      ③ 返回值类型：
 *      	>父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型只能是void
 *      	>父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A类的子类
 *      	>父类被重写的方法的返回值类型是基本数据类型(比如：double)，则子类重写的方法的返回值类型必须是相同的基本数据类型(必须也是double)
 *		④ 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型（具体放到异常处理时候讲）
 *	**********************************************************************
 *		子类和父类中的同名同参数的方法要么都声明为非static的（考虑重写），要么都声明为static的（不是重写）。
 *
 * 面试题：区分方法的重载与重写
 */

class Circle{
    public double findArea(int a){
        return a;
    }//求面积
}
class Cylinder extends Circle{
    public double findArea(int a){
        return 3.14*a;
    }//求表面积
}

class Account{
    public boolean withdraw(double amt){
        return true;
    }
}
class CheckAccount extends Account{
    public boolean withdraw(double amt){
        return true;
    }
}
