package offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Chris
 * @create 2021-08-28-21:00
 */
/*
* 剑指 Offer 27. 二叉树的镜像

请完成一个函数，输入一个二叉树，该函数输出它的镜像。

例如输入：

     4
   /   \
  2     7
 / \   / \
1   3 6   9
镜像输出：

     4
   /   \
  7     2
 / \   / \
9   6 3   1



示例 1：

输入：root = [4,2,7,1,3,6,9]
输出：[4,7,2,9,6,3,1]
*/
public class offer27 {

    // BFS
    public TreeNode27 mirrorTree(TreeNode27 root) {
        if(root==null){
            return root;
        }

        Queue<TreeNode27> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode27 node = queue.poll();
            TreeNode27 temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return root;
    }

    //DFS
    public TreeNode27 mirrorTree1(TreeNode27 root) {
        if(root==null){
            return root;
        }
        Stack<TreeNode27> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode27 node = stack.pop();
            TreeNode27 temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
        }
        return root;

    }
}


class TreeNode27 {
    int val;
    TreeNode27 left;
    TreeNode27 right;
    TreeNode27(int x) { val = x; }
}
