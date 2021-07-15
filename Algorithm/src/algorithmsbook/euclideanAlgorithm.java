package algorithmsbook;

/**
 * @author Chris
 * @create 2021-07-15-20:55
 */

// 欧几里得算法:求2个整数的最大公约数
public class euclideanAlgorithm {
    public static int gcd(int p, int q){
        if(q == 0)
            return p;
        int r = p%q;
        return gcd(q,r);
    }

    public static void main(String[] args) {
        int a = gcd(20,5);
        System.out.println(a);
    }
}
