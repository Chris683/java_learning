package basicgrammar;

/**
 * @author Chris
 * @create 2021-07-01-22:34
 */
// 5.2 类型转换
// 自动转换，容量小的类型自动转换为容量大的数据类型。数据类型按容量大小排序为byte、short、char、int、long、float、double
// byte,short,char之间不会相互转换，他们三者在计算时首先转换为int类型
// boolean类型不能与其它数据类型运算
// 当把任何基本数据类型的值和字符串(String)进行连接运算时(+)，基本数据类型的值将自动转化为字符串(String)类型
// 强制类型转换，将容量大的数据类型转换为容量小的数据类型
public class TypeConversion{
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

        int a;
        a = (int) (3.9);
        System.out.println(a);
    }

}
// 5.3 final
// 当一个变量被final修饰的时候，该变量只有一次赋值的机会
