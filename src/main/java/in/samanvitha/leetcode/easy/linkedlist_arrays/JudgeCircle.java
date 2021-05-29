package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class JudgeCircle {
    public static void main( String[] args ) {
        JudgeCircle obj = new JudgeCircle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scanner.next();
        System.out.println(obj.judgeCircle(s));
    }





    public boolean judgeCircle(String moves) {
        if(moves.length()==0){
            throw new IllegalArgumentException("Empty string not allowed");
        }
        int a=0,b=0;
        for (char ch : moves.toCharArray())
        {
            switch(ch)
            {
                case 'U':b++;
                    break;
                case 'D':b--;
                    break;
                case 'L':a--;
                    break;
                case 'R':a++;
                    break;
                default :throw new IllegalArgumentException("Only U D L R characters are allowed");
            }
        }
        if(a==b && a==0)
            return true;
        else
            return false;
    }
}
