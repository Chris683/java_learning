package singleton;

/**
 * @author Chris
 * @create 2021-08-30-12:48
 */
// 静态内部类
public class Singleton4 {
    private Singleton4() {};

    private static class SingletonHolder{
        private static Singleton4 instance=new Singleton4();
    }

    public static Singleton4 getInstance(){
        return SingletonHolder.instance;
    }

}

class SingletonTest04 {

    public static void main(String[] args) {
        //测试
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}