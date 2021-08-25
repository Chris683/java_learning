package offer;

/**
 * @author Chris
 * @create 2021-08-25-13:26
 */

/*
* 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。

单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内
的字母不允许被重复使用
示例 1：

输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
输出：true

示例 2：

输入：board = [["a","b"],["c","d"]], word = "abcd"
输出：false


*/
public class offer12 {
    public boolean exist(char[][] board, String word) {
//        if(board == null || board.length ==0 || board[0].length == 0
//         || word == null || word.length()==0){
//            return false;
//        }

        // 遍历整个board,将每个元素都看作起始顶点开始搜寻
        for(int i=0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                int k=0;
                if(dfs(board,word,i,j,k)){  // 返回找到的第一个次
                    return true;
                }
            }
        }
        return false;
    }

    // 定义一个函数,board表示字符数组，word表示字符串，i和j是起始顶点的坐标，k是字符串的下  标，从0开始。
    boolean dfs(char[][] board,String word,int i,int j,int k){
        if(k == word.length()){ //结束条件1
            return true;
        }

        if(i<0 ||i==board.length || j<0 || j==board[0].length // 结束条件2
                ||board[i][j] != word.charAt(k)){
            return false;
        }

        board[i][j] = ' ';//当前遍历的进行标记，防止重复访问

        // 递归，深度遍历+剪枝
        boolean res = dfs(board,word,i-1,j,k+1)||dfs(board,word,i+1,j,k+1)||
                dfs(board,word,i,j-1,k+1)||dfs(board,word,i,j+1,k+1);

        board[i][j] = word.charAt(k);// 回溯，见标记位复原，

        return res;
    }
}
