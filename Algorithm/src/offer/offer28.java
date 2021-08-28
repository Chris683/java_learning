package offer;

/**
 * @author Chris
 * @create 2021-08-28-21:53
 */
/*
* 剑指 Offer 28. 对称的二叉树

请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3



示例 1：

输入：root = [1,2,2,3,4,4,3]
输出：true

示例 2：

输入：root = [1,2,2,null,3,null,3]
输出：false*/
public class offer28 {

    //
    public boolean isSymmetric(TreeNode28 root) {
        if(root == null){
            return true;
        }
        return recur(root.left,root.right);
    }

    //对称原理
    boolean recur(TreeNode28 left,TreeNode28 right){
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null||left.val!=right.val){
            return false;
        }
        return recur(left.left,right.right) && recur(left.right,right.left);
    }
}

class TreeNode28 {
    int val;
    TreeNode28 left;
    TreeNode28 right;
    TreeNode28(int x) { val = x; }
}