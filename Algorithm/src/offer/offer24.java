package offer;

/**
 * @author Chris
 * @create 2021-08-25-10:40
 */
/*
* 剑指 Offer 24. 反转链表

定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。



示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
* */
public class offer24 {
    // 方法一
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode head1 = new ListNode(0);
        ListNode temp = head;
        ListNode node = null;

        while(temp != null){
            node = temp.next;
            temp.next = head1.next;
            head1.next = temp;
            temp = node;
        }
        head = head1.next;
        return head;
    }
    // 方法二
    public ListNode reverseList1(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode temp = head;
        ListNode next = null;

        while(temp !=null){
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        return pre;
    }

    // 递归
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }
}
