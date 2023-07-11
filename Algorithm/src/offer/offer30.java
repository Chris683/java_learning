package offer;

/**
 * @author Chris
 * @create 2021-09-07-13:05
 */

import java.util.Stack;

/**
 *剑指 Offer 30. 包含min函数的栈
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 *
 *
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.min();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.min();   --> 返回 -2.
 */

public class offer30 {
    Stack<Integer> A,B;

    /** initialize your data structure here. */
    public offer30() {
        A = new Stack<>();
        B = new Stack<>();
    }
    public void push(int x) {
        A.add(x);
        if( B.empty() || B.peek()>=x){
            B.add(x);
        }
    }
    public void pop() {
        if(A.pop().equals(B.peek())){
            B.pop();
        }
    }
    public int top() {
        return A.peek();
    }
    public int min() {
        return B.peek();
    }
}
