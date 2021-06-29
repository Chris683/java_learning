/**
 * @author Chris
 * @create 2021-06-29-15:22
 */
/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 * 示例 1:
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 *
 * */
// 方法一
class PrintNumbers {
    public int[] printNumbers(int n) {
        int a = 1;
        while (n != 0) {
            a = 10 * a;
            n--;
        }
        int[] arr = new int[a - 1];
        for (int i = 0; i < a - 1; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}


