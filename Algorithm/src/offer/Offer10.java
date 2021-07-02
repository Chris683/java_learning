package offer;

/**
 * @author Chris
 * @create 2021-07-01-21:26
 */

/** 10 斐波那契（Fibonacci）数列
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 *
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1
 *
 */

// 方法一 时间复杂度 O(N)，空间复杂度 O(n)
public class Offer10 {
    // 方法一 时间复杂度 O(N)，空间复杂度 O(n)
    public int fib(int n) {
        if(n<2){
            return n;                   // n<2的情况
        }
        int[] arr = new int[n+2];       // 创建数组，后面是n+2
        n++;                            // 为后面i<n准备
        arr[0] = 0;
        arr[1] = 1;
        int i=2;
        while(i<n){
            arr[i] = (arr[i-1] +arr[i-2]) %1000000007;        // 公式，
            i++;
        }
        return arr[i-1];                 // 返回最终值
    }

    // 方法二时间复杂度 O(N)，空间复杂度 O(1)
    public int fib02(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     *
     * 示例 1：
     * 输入：n = 2    输出：2
     *
     * 示例 2：
     * 输入：n = 7    输出：21
     *
     * 示例 3：
     * 输入：n = 0      输出：1
     */
    // 也是个斐波那契（Fibonacci）数列问题
    public int numWays(int n) {
        int[] arr = new int[n+1];
        if(n<2){
            return 1;
        }
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=n;i++){
            arr[i] = (arr[i-1] + arr[i-2])%1000000007;
        }
        return arr[n];
    }
}
