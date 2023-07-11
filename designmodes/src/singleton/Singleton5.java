package singleton;

/**
 * @author Chris
 * @create 2021-08-30-12:50
 */
enum Singleton5 {

    instance;

    private Singleton5() {}

    public void method(){
    }
}


class SingletonTest05 {

    public static void main(String[] args) {
        //测试
        Singleton5 instance = Singleton5.instance;
        Singleton5 instance2 = Singleton5.instance;
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}
