package offer;

/**
 * @author Chris
 * @create 2021-08-25-20:21
 */


/*
* 剑指 Offer 15. 二进制中1的个数

编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量).）。



提示：

    请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
    在 Java 中，编译器使用 二进制补码 记法来表示有符号整数。因此，在上面的 示例 3 中，输入表示有符号整数 -3。



示例 1：

输入：n = 11 (控制台输入 00000000000000000000000000001011)
输出：3
解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。

示例 2：

输入：n = 128 (控制台输入 00000000000000000000000010000000)
输出：1
解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。

示例 3：

输入：n = 4294967293 (控制台输入 11111111111111111111111111111101，部分语言中 n = -3）
输出：31
解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
* */
public class offer15 {



    // 方法一 ，当检查第 iii 位时，我们可以让 nnn 与 2i2^i2i 进行与运算，当且仅当 nnn 的第 iii 位为 111 时，运算
    // 结果不为 000。
    public int hammingWeight(int n) {
        int num = 0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0){
                num++;
            }
        }
        return num;

    }

    // 方法二 n & (n−1)n~\&~(n - 1)n & (n−1)，其预算结果恰为把 nnn 的二进制位中的最低位的 111 变为 000 之后的结果。
    public int hammingWeight2(int n) {
        int num = 0;
        while(n!=0){
            n = n&(n-1);
            num++;
        }
        return num;

    }
}
