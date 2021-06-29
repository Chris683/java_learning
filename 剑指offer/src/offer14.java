/**
 * @author Chris
 * @create 2021-06-29-16:59
 */
/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 示例 1：
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 *
 * 示例 2:
 *
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
 *
 */

/*
解题思路    1*2<1+2=3  2*2=2+2=4;
2=1*1；
3=2*1；
4=2*2；
5=2*3；
6=3*3
7=3*2*2
8=3*3*2
...
15=3*3*3*3*3
16=3*3*3*3*4
17=3*3*3*3*3*2
 */


class Solution14 {
    public int cuttingRope(int n) {
        if(n<4){
            return n-1;
        }
        int a;
        double num;
        a = n/3;
        if(n%3==0){
            num = Math.pow(3,a);
        }else if(n%3==1){
            num = Math.pow(3,a)/3*4;
        }else{
            num = Math.pow(3,a)*2;
        }
        int b = (int)num;
        return b;
    }
}

class Solution1401 {
    public int cuttingRope(int n) {
        if(n<4){
            return n-1;
        }
        int a;
        int num = 1;
        a = n/3;
        if(n%3==0){
            while(a!=0){
                num = num*3;
                a--;
            }
        }else if(n%3==1){
            while(a!=0){
                num = num*3;
                a--;
            }
        }else{
            while(a!=0){
                num = num*3;
                a--;
            }
        }
        if(n%3==0){
            return num;
        }else if(n%3==1){
            num =  num/3*4;
        }else{
            num = num*2;
        }
        return num;
    }
}
