package offer;

/**
 * @author Chris
 * @create 2021-08-27-13:27
 */
/*
* 剑指 Offer 25. 合并两个排序的链表

输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

示例1：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
* */
public class offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);

        ListNode temp = list;

        while(l2!=null && l1!=null){
            if(l1.val<l2.val){
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }else{
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }

        temp.next= l1!=null?l1:l2;

        return list.next;

    }
}
