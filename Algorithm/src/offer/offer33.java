package offer;

/**
 * @author Chris
 * @create 2021-09-14-10:03
 */

import java.util.Scanner;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 *
 *
 *
 * 参考以下这颗二叉搜索树：
 *
 *      5
 *     / \
 *    2   6
 *   / \
 *  1   3
 *
 * 示例 1：
 *
 * 输入: [1,6,3,2,5]
 * 输出: false
 *
 * 示例 2：
 *
 * 输入: [1,3,2,6,5]
 * 输出: true
 *
 */

public class offer33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().replace("[","").replace("]","").split(", ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(arr.toString());
        System.out.println(verifyPostorder(arr));
    }
    public static boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }

    static boolean recur(int[] postorder,int left,int right){
        if(left>=right){
            return true;
        }

        int mid = left;
        while(postorder[mid]<postorder[right]){
            mid++;
        }

        int temp = mid;

        while(temp<right){
            if(postorder[temp]<postorder[right]){
                return false;
            }
            temp++;
        }

        return recur(postorder,left,mid-1)&&recur(postorder,mid,right-1);
    }
}
