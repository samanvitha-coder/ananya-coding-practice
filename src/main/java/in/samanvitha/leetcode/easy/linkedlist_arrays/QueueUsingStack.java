package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Stack;

public class QueueUsingStack {
    public static void main( String[] args ) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.empty());
    }


        Stack<Integer> inStack;
        Stack<Integer> outStack;
        public QueueUsingStack() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }


        public void push(int x) {

            inStack.push(x);
        }

        public int pop() {
            if(outStack.isEmpty()){
                while(!inStack.isEmpty())
                    outStack.push(inStack.pop());
            }
            return outStack.pop();
        }


        public int peek() {
            if(outStack.isEmpty()){
                while(!inStack.isEmpty())
                    outStack.push(inStack.pop());
            }
            return outStack.peek();
        }


        public boolean empty() {
            if(outStack.isEmpty() && inStack.isEmpty())
                return true;
            return false;
        }


}
