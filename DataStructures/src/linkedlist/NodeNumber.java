package linkedlist;

import java.util.Stack;

/**
 * @author Chris
 * @create 2021-08-10-13:16
 */

// 获取到单链表的节点的个数(如果是带头结点的链表，需求不统计头节点)
public class NodeNumber {
    public int getLength(HeroNode head) {
        if (head.next == null) { //空链表
            return 0;
        }
        int length = 0;
        //定义一个辅助的变量, 这里我们没有统计头节点
        HeroNode cur = head.next;
        while (cur != null) {
            length++;
            cur = cur.next; //遍历
        }
        return length;
    }

    //查找单链表中的倒数第k个结点 【新浪面试题】
    //思路
    //1. 编写一个方法，接收head节点，同时接收一个index
    //2. index 表示是倒数第index个节点
    //3. 先把链表从头到尾遍历，得到链表的总的长度 getLength
    //4. 得到size 后，我们从链表的第一个开始遍历 (size-index)个，就可以得到
    //5. 如果找到了，则返回该节点，否则返回nulll
    public HeroNode findNode(HeroNode head, int index){
        if (head.next==null){
            return null;// 没有找到
        }
        NodeNumber nodeNumber = new NodeNumber();
        int size = nodeNumber.getLength(head);
        if (index<=0 || index>size){
            return null;
        }
        //定义给辅助变量， for 循环定位到倒数的index
        HeroNode cur = head.next; //3 // 3 - 1 = 2
        for(int i =0; i< size - index; i++) {
            cur = cur.next;
        }
        return cur;

    }



    // 反转链表
    public void reverseList(HeroNode head){
        if (head.next == null||head.next.next==null){
            return;
        }

        //定义一个辅助的指针(变量)，帮助我们遍历原来的链表
        HeroNode cur =head.next;
        HeroNode next = null;// 指向当前节点[cur]的下一个节点
        HeroNode reversHead = new HeroNode(0,"","");

        //遍历原来的链表，每遍历一个节点，就将其取出，并放在新的链表reverseHead 的最前端
        while (cur!=null){
            next = cur.next;//先暂时保存当前节点的下一个节点，因为后面需要使用
            cur.next = reversHead.next;//将cur的下一个节点指向新的链表的最前端
            reversHead.next = cur;//将cur 连接到新的链表上
            cur = next;//让cur后移
        }
        //将head.next 指向 reverseHead.next , 实现单链表的反转
        head.next = reversHead.next;

    }

    // 逆序打印链表
    //可以利用栈这个数据结构，将各个节点压入到栈中，然后利用栈的先进后出的特点，就实现了逆序打印的效果
    public void reversePrint(HeroNode head) {
        if (head.next == null) {
            return;//空链表，不能打印
        }
        //创建要给一个栈，将各个节点压入栈
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode cur = head.next;
        //将链表的所有节点压入栈
        while (cur != null) {
            stack.push(cur);
            cur = cur.next; //cur后移，这样就可以压入下一个节点
        }
        //将栈中的节点进行打印,pop 出栈
        while (stack.size() > 0) {
            System.out.println(stack.pop()); //stack的特点是先进后出
        }
    }


    // 测试
    public static void main(String[] args) {
        //进行测试
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建要给链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        //加入按照编号的顺序
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero4);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero3);

        //显示一把
        singleLinkedList.list();

        NodeNumber nodeNumber = new NodeNumber();

        int num = nodeNumber.getLength(singleLinkedList.getHead());
        //测试一下 求单链表中有效节点的个数
        System.out.println("有效的节点个数=" + num);//2

        System.out.println("获取倒数第k个节点");
        HeroNode heroNode = nodeNumber.findNode(singleLinkedList.getHead(),2);
        System.out.println(heroNode);

        //
        System.out.println("反转链表：");
        nodeNumber.reverseList(singleLinkedList.getHead());
        singleLinkedList.list();

        System.out.println("反向打印");
        nodeNumber.reversePrint(singleLinkedList.getHead());
    }

}
