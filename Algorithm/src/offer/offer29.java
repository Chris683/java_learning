package offer;

/**
 * @author Chris
 * @create 2021-08-21-20:59
 */
/**
 *输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 *
 *
 * 示例 1：
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 *
 * 示例 2：
 *
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */

public class offer29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int left = 0;
        int rigit = matrix[0].length;
        int low = 0;
        int high = matrix.length;
        int a = rigit*high;
        int b =0;
        int[] arr = new int[a+10];
        high--;
        rigit--;

        while(high >= low && rigit >= left){
            for(int i = left; i<=rigit;i++){
                arr[b++] = matrix[low][i];
            }
            low++;

            for(int j=low;j<=high;j++){
                arr[b++] = matrix[j][rigit];
            }
            rigit--;

            for(int k = rigit;k>=left;k--){
                arr[b++] = matrix[high][k];
            }
            high--;

            for(int l = high;l>=low;l--){
                arr[b++] = matrix[l][left];
            }
            left++;
        }
        int[] arr1 = new int[a];
        for(int i = 0;i<a;i++){
            arr1[i] =arr[i];
        }
        return arr1;
    }


    public int[] spiralOrder2(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int left = 0;
        int rigit = matrix[0].length;
        int low = 0;
        int high = matrix.length;
        int a = rigit*high;
        int b =0;
        int[] arr = new int[a];
        high--;
        rigit--;

        while(high >= low && rigit >= left){
            for(int i = left; i<=rigit;i++){
                arr[b++] = matrix[low][i];

            }
            low++;

            for(int j=low;j<=high;j++){
                arr[b++] = matrix[j][rigit];

            }
            rigit--;

            for(int k = rigit;k>=left && high >= low;k--){
                arr[b++] = matrix[high][k];

            }
            high--;

            for(int l = high;l>=low && rigit >= left;l--){
                arr[b++] = matrix[l][left];

            }
            left++;
        }
        return arr;
    }
}
