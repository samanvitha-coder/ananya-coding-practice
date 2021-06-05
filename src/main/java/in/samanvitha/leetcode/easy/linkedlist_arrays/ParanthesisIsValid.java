package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Stack;

public class ParanthesisIsValid {
    public static void main( String[] args ) {
        ParanthesisIsValid obj = new ParanthesisIsValid();
        System.out.println(obj.isValid("({})"));
    }
    public boolean isValid(String s) {
        if(s==null){
            throw new IllegalArgumentException("Null value not allowed");
        }
        if(s.length()==0){
            throw new IllegalArgumentException("Empty String not allowed");
        }

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') stack.push(getComplement(ch));
            else if (stack.empty() || !stack.pop().equals(ch)) return false;
        }
        return stack.empty();
    }

    private char getComplement(char ch) {
        switch (ch) {
            case '(':
                ch = ')';
                break;
            case '{':
                ch = '}';
                break;
            case '[':
                ch = ']';
                break;
        }
        return ch;
    }
}
