package offer;

import java.util.Stack;

/**
 * @author Chris
 * @create 2021-08-21-21:50
 */
public class offer06 {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            stack.push(temp);
            temp = temp.next;
        }
        int len = stack.size();
        int[] arr = new int[len];
        for(int i = 0;i<len;i++){
            arr[i]=stack.pop().val;
        }
        return arr;

    }
}
 class ListNode {
      int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
