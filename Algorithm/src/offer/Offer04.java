package offer;

/**
 * @author Chris
 * @create 2021-07-01-21:17
 */
/** 4 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样
 * 的一个二维数组和一个整数，判断数组中是否含有该整数。
 *示例:
 *现有矩阵 matrix 如下：
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * 给定 target = 20，返回 false。
 */
public class Offer04 {
    // 方法一：时间复杂度O(nm)，空间复杂度O(1)
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {                     // 判断数组是否为空
            return false;
        }
        for(int k=0;k<matrix.length;k++){                              // 两个for循环，暴力查找
            for(int l=0;l<matrix[0].length;l++){
                if(target==matrix[k][l]){
                    return true;
                }
            }
        }
        return false;
    }
    // 方法2 时间复杂度：O(n+m) 空间复杂度：O(1)
    public boolean findNumberIn2DArra02(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {                   // 判断数组是否为空
            return false;
        }
        int n = matrix.length;                                       // 数组的行
        int m = matrix[0].length;                                    // 数组的列
        int i = 0;
        int j = m-1;
        while(i<n && j>=0){                                          // 从数组的右上角开始matrix[0][m-1]，判断和target的关系，
            if(matrix[i][j]==target){                                // 相等
                return true;
            }else if(matrix[i][j]>target){                           // 大于目标值target，则数组元素左移，即j--
                j--;
            }else{                                                   // 小于目标值target，则数组元素下移动，即i++；
                i++;
            }
        }
        return false;
    }
}
