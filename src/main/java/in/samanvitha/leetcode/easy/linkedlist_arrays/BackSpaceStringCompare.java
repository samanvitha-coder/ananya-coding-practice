package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Stack;

public class BackSpaceStringCompare {
    public static void main( String[] args ) {
        BackSpaceStringCompare obj = new BackSpaceStringCompare();
        System.out.println(obj.backspaceCompare("ab#c","ad#c"));
    }
    public boolean backspaceCompare(String s, String t) {
        if(s==null || t==null){
            throw new IllegalArgumentException ("Null value not allowed");
        }
        if(s.length()==0 || t.length()==0){
            throw new IllegalArgumentException("Empty String not allowed");
        }
        String s1 = value(s);
        String s2  = value(t);

        return s1.equals(s2);
    }

    private String value(String s) {
        String out = "";
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '#'){
                if(st.size() > 0) {
                    st.pop();
                }

            } else {
                st.push(c);
            }
        }

        for(Character c: st){
            out = out + c;
        }

        return out;
    }
}
