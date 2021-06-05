package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main( String[] args ) {
        MakeTheStringGreat obj = new MakeTheStringGreat();
        System.out.println(obj.makeGood("abBbccCea"));


    }
    public String makeGood(String s) {
        if(s==null)
            throw new IllegalArgumentException("Null value not allowed");
        if(s.length()==0)
            throw new IllegalArgumentException("Empty String not allowed");
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        char[] ca=s.toCharArray();
        for(char ch:ca){
            if(!stack.isEmpty()){
                int a=ch;
                int b=stack.peek();
                if(a-b==32 || a-b==-32){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
