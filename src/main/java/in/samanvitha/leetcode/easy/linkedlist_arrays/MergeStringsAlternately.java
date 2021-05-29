package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class MergeStringsAlternately {
    public static void main( String[] args ) {
        MergeStringsAlternately obj = new MergeStringsAlternately();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String s1 = scanner.next();
        System.out.println("Enter 2nd string");
        String s2 = scanner.next();
        System.out.println(obj.mergeAlternately(s1,s2));
    }




    public String mergeAlternately(String word1, String word2) {
        if(word1.length()==0 && word2.length()==0)
            throw new IllegalArgumentException("Empty strings are not allowed");
        StringBuilder sb = new StringBuilder();
        int cur = 0;
        while (cur < word1.length() || cur < word2.length()) {
            if (cur < word1.length()) {
                sb.append(word1.charAt(cur));
            }

            if (cur < word2.length()) {
                sb.append(word2.charAt(cur));
            }

            cur++;
        }

        return sb.toString();
    }
}
