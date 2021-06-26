/**
 * @author Chris
 * @create 2021-06-25-21:35
 */

/**  二维数组中的查找
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

// 方法一：时间复杂度O(nm)，空间复杂度O(1)
class offer04{
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        for(int k=0;k<matrix.length;k++){
            for(int l=0;l<matrix[0].length;l++){
                if(target==matrix[k][l]){
                    return true;
                }
            }
        }
        return false;
    }
}


// 方法2 时间复杂度：O(n+m) 空间复杂度：O(1)
class offer0402 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m-1;
        while(i<n && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
    return false;
    }
}


