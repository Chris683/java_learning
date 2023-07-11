package proxymedox;

/**
 * @author Chris
 * @create 2021-08-31-12:32
 */

// 抽象主题   找到老师问事情
interface IPerson {
    void findTeacher(); //找老师
}
//真是主题
class ZhangSan implements IPerson {
    @Override
    public void findTeacher() {
        System.out.println("明天上课不");
    }
}

// 代理
class ZhangLaoSan implements IPerson {
    private ZhangSan zhangsan;
    public ZhangLaoSan(ZhangSan zhangsan) {
        this.zhangsan = zhangsan;
    }
    @Override
    public void findTeacher() {
        System.out.println("父亲开始找老师");
        zhangsan.findTeacher();
        System.out.println("上课就写作业，不上课打游戏");
    }
}
/*
class JdkFuDao implements InvocationHandler {
    private IPerson target;
    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }
    private void after() {
        System.out.println("双方同意，开始辅导");
    }
    private void before() {
        System.out.println("这里是C语言中文网辅导班，已经收集到您的需求，开始挑选老师");
    }
}
class ZhaoLiu implements IPerson {
    @Override
    public void findTeacher() {
        System.out.println("符合赵六的要求");
    }
    public void buyInsure() {
    }
}
class Test {
    public static void main(String[] args) {
        JdkFuDao jdkFuDao = new JdkFuDao();
        IPerson zhaoliu = jdkFuDao.getInstance(new ZhaoLiu());
        zhaoliu.findTeacher();
    }
}
*/
// 客户端测试
public class findTeacherTest {
    public static void main(String[] args) {
        ZhangLaoSan zhanglaosan = new ZhangLaoSan(new ZhangSan());
        zhanglaosan.findTeacher();
    }
}

