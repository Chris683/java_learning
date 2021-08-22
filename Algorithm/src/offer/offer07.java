package offer;

/**
 * @author Chris
 * @create 2021-08-22-10:20
 */
public class offer07 {
    public TreeNode1 reConstructBinaryTree(int [] pre, int [] in) {
        TreeNode1 root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    /**
     *
     * @param pre 前序遍历序列的数组
     * @param startPre 前序遍历序列中 新子树开始的序号的下标
     * @param endPre   前序遍历序列中 新子树结束的序号的下标
     * @param in 中序遍历序列的数组
     * @param startIn  中序遍历序列中 新子树开始的序号的下标
     * @param endIn    中序遍历序列中 新子树结束的序号的下标
     * @return
     */
    private TreeNode1 reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
        /**
         * 作为退出递归的条件
         * 当该子树在序列中的开始的下标大于结束的下标时，说明已经没有子树，将该子树置为null
         */
        if(startPre>endPre||startIn>endIn)
            return null;
        /**
         * 新子树的根节点（一定是当前前序遍历序列中的pre[startPre]）
         */
        TreeNode1 root=new TreeNode1(pre[startPre]);


        for(int i=startIn;i<=endIn;i++)
        /**
         根据前序遍历的序列和中序遍历的序列，找出新子树的根节点，并递归计算新子树下的左子树和右子数
         i即是中序遍历序列中本树的根节点的位置
         */
            if(in[i]==pre[startPre]){
                /**
                 *startPre = startPre + 1 ：startPre是前序遍历序列中本树的根节点，所以下次递归要从本树的子树序列开始
                 * endPre = startPre + i -startIn :下次递归本树的子树序列结束的位置，在中序遍历序列中i的左边的所有序列都是本树的左子树，所以i也是本树的左子树的个数（如图一）
                 */
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                /**
                 * 里面的加加减减好难解释啊...有种只可意会不可言传的感觉。。。
                 * 相信你们将程序单步调试几遍后就会明白
                 */
                root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                break;
            }
        return root;
    }

}

class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1(int x) { val = x; }

 }

/**
 * class Solution {
 *     public TreeNode buildTree(int[] preorder, int[] inorder) {
 *         TreeNode root = reBuidTree(preorder,0,preorder.length-1,
 *                                    inorder, 0,inorder.length-1);
 *         return root;
 *
 *     }
 *
 *     public TreeNode reBuidTree(int[] pre,int preStart,int preEnd,
 *                                int[] mid,int midStart,int midEnd ){
 *         if(preStart>preEnd||midStart>midEnd){
 *             return null;
 *         }
 *         TreeNode root = new TreeNode(pre[preStart]);
 *         for(int i= midStart;i<=midEnd;i++){
 *             if(mid[i] == pre[preStart]){
 *                 root.left = reBuidTree(pre,preStart+1,preStart+i-midStart,
 *                                        mid,midStart,i-1);
 *
 *                 root.right = reBuidTree(pre,preStart+i-midStart+1,preEnd,
 *                                         mid,i+1,midEnd);
 *             }
 *         }
 *         return root;
 *     }
 * }
 */
