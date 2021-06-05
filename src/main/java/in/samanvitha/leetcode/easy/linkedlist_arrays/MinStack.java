package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Stack;

public class MinStack {
    public static void main( String[] args ) {
        MinStack obj = new MinStack();
        obj.push(-5);
        obj.push(-2);
        obj.push(4);
        obj.pop();
        obj.push(-3);
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MinStack() {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }

    public void push(int val) {
        s1.push(val);

        if(s2.size()==0 || s2.peek()>val)
            s2.push(val);
        else
        {
            s2.push(s2.peek());
        }
    }

    public void pop() {
        s1.pop();
        s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {

        int min=s2.peek();
        return min;
    }
}
