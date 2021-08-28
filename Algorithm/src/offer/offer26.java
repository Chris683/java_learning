package offer;

/**
 * @author Chris
 * @create 2021-08-28-18:33
 */
/*
*剑指 Offer 26. 树的子结构

输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)

B是A的子结构， 即 A中有出现和B相同的结构和节点值。

例如:
给定的树 A:

     3
    / \
   4   5
  / \
 1   2
给定的树 B：

   4
  /
 1
返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。

示例 1：

输入：A = [1,2,3], B = [3,1]
输出：false

示例 2：

输入：A = [3,4,5,1,2], B = [4,1]
输出：true
* */
public class offer26 {
    public boolean isSubStructure(TreeNode26 A, TreeNode26 B) {
        if(A==null||B==null){
            return false;
        }
        return isSub(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }
    boolean isSub(TreeNode26 A,TreeNode26 B){
        if(B==null){
            return true;
        }
        if(A==null||A.val!=B.val){
            return false;
        }
        return isSub(A.left,B.left)&&isSub(A.right,B.right);
    }
}

class TreeNode26 {
    int val;
    TreeNode26 left;
    TreeNode26 right;
    TreeNode26(int x) { val = x; }
}
