package singleton;

/**
 * @author Chris
 * @create 2021-08-30-12:39
 */
class SingletonTest03 {

    public static void main(String[] args) {
        //测试
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}


// 懒汉式
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        if(instance==null);{
            synchronized(Singleton3.class){
                if(instance==null){
                    instance =new Singleton3();
                }
            }
        }
        return instance;
    }
}
