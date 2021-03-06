package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Chris
 * @create 2021-08-28-20:43
 */
/*
* 剑指 Offer 32 - I. 从上到下打印二叉树

从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。



例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

返回：

[3,9,20,15,7]
*/
public class offer32 {
    public int[] levelOrder(TreeNode32 root) {
        if(root==null){
            return new int[0];
        }
        // 广度优先
        Queue<TreeNode32> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode32 temp = queue.poll();
            list.add(temp.val);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }

        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;

    }

}

 class TreeNode32 {
     int val;
     TreeNode32 left;
     TreeNode32 right;

     TreeNode32(int x) {
         val = x;
     }
 }