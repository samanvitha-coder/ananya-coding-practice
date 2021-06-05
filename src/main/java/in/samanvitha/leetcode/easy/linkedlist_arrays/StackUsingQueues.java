package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    public static void main( String[] args ) {
        StackUsingQueues obj = new StackUsingQueues();
         obj.push(1);
        obj.push(2);
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }

    Queue<Integer> q1;
    Queue<Integer> q2;
    int top;

    /** Initialize your data structure here. */
    public StackUsingQueues() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    /** Push element x onto stack.
     * @return*/
    public void push( int x) {
        q1.add(x);
        top=x;


    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        top = -1;
        int i =0;
        int result = -1;
        int size = q1.size();
        while(!q1.isEmpty()){
            result=q1.remove();
            if(++i<size ) {
                if (i == size - 1) {
                    top = result;
                }
                    q2.add(result);
            }

        }
//        int last = q1.poll();
        Queue<Integer> temp = q2;
        q2=q1;
        q1=temp;
        return result;

    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
