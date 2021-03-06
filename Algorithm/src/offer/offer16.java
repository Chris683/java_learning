package offer;

/**
 * @author Chris
 * @create 2021-08-25-21:03
 */

/**
 * 剑指 Offer 16. 数值的整数次方
 *
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 *
 *
 *
 * 示例 1：
 *
 * 输入：x = 2.00000, n = 10
 * 输出：1024.00000
 *
 * 示例 2：
 *
 * 输入：x = 2.10000, n = 3
 * 输出：9.26100
 *
 * 示例 3：
 *
 * 输入：x = 2.00000, n = -2
 * 输出：0.25000
 * 解释：2-2 = 1/22 = 1/4 = 0.25
 *
 */

public class offer16 {
    public double myPow(double x, int n) {
        if(x==0){
            return 0;
        }
        double sum=1.0;
        long m=n;
        if(m<0){
            m=-m;
            x=1/x;
        }
        while(m>0){
            if((m&1)==1){
                sum*=x;
            }
            x*=x;
            m>>=1;
        }
        return sum;
    }
}
