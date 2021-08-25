package offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chris
 * @create 2021-08-25-15:45
 */

/**
 *
 * 剑指 Offer 13. 机器人的运动范围
 *
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、
 * 右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够
 * 进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 *
 *
 *
 * 示例 1：
 *
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 *
 * 示例 2：
 *
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 */

public class offer13 {

    // 方法一dfs
    public int movingCount(int m, int n, int k) {
        boolean[][] arr = new boolean[m][n];
        return dfs(arr,0,0,m,n,k);
    }
    // 深度优先遍历
    int dfs(boolean[][] arr,int i,int j,int m,int n,int k){
        // i>=m || j>=n || numberSum(i,j)>k判断这个格子是否可以访问
        // arr[i][j]排除已经访问的格子
        if(i>=m || j>=n || numberSum(i,j)>k || arr[i][j]){
            return 0;
        }
        arr[i][j]=true;// 标注这个格子访问过
        return 1+dfs(arr,i+1,j,m,n,k)+dfs(arr,i,j+1,m,n,k);
    }

    // 计算两坐标数字和
    int numberSum(int i,int j){
        int sum=0;
        while(i!=0){
            sum = sum+i%10;
            i = i/10;
        }
        while(j!=0){
            sum = sum +j%10;
            j = j/10;
        }
        return sum;
    }


    // 方法二 bfs
    public int movingCount2(int m, int n, int k) {
        // 用于标记被访问的格子
        boolean[][] arr = new boolean[m][n];
        int res = 0;// 初始为0

        // 创建队列
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});// 添加[0,0]坐标到队列中

        // 循环
        while(queue.size()!=0){
            int[] temp = queue.poll();//移除队列元素
            int i = temp[0];
            int j = temp[1];



            // i>=m || j>=n || numberSum(i,j)>k判断这个格子是否可以访问
            // arr[i][j]排除已经访问的格子
            if(i>=m || j>=n || numberSum(i,j)>k || arr[i][j]){
                continue;
            }

            arr[i][j]=true;// 标记以访问过的元素
            res++;
            // 添加格子下边
            queue.add(new int[]{i+1,j});
            // 添加格子右边
            queue.add(new int[]{i,j+1});
        }
        return res;
    }
}
