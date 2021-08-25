package offer;

/**
 * @author Chris
 * @create 2021-07-01-21:31
 */

/**11 数组的旋转
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 *
 * 示例 1：
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 *
 * 示例 2：
 *
 * 输入：[2,2,2,0,1]
 * 输出：0
 *
 */
public class Offer11 {
    public int minArray(int[] numbers) {
        int n=numbers.length;                // 数组长度
        for(int i=1;i<n;i++){                // 遍历数组
            if(numbers[i-1]>numbers[i]){     // 对比相邻数组大小
                return numbers[i];           // 返回最小值
            }
        }
        return numbers[0];                   // 其他情况返回最小值
    }

    public int minArray02(int[] numbers) {
        int n;
        n = numbers.length;                  //数组长度
        int a=numbers[0];                    //定义变量a
        for(int i =0;i<n;i++){               //遍历数组
            if(a>numbers[i]){                //比a小的赋值a
                a=numbers[i];
            }
        }
        return a;                            //返回最小值
    }

    // 二分
    public int minArray2(int[] numbers) {
        if(numbers==null||numbers.length==0){
            return -1;
        }
        int pre = 0;
        int end = numbers.length-1;
        int mid;
        while(pre<end){
            mid = (pre+end)/2;
            if(numbers[mid] < numbers[end]){
                end = mid;
            }else if(numbers[mid] > numbers[end]) {
                pre = mid+1;
            }else{
                end--;
            }
        }
        return numbers[pre];
    }
}

