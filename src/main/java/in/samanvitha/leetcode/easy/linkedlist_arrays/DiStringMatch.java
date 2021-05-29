package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class DiStringMatch {
    public static void main( String[] args ) {
        DiStringMatch obj = new DiStringMatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scanner.next();
        int[] arr = new int[s.length()+1];
        arr = obj.diStringMatch(s);
        System.out.print("[ ");
        for(int i=0;i<=s.length();i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("]");
    }


    public int[] diStringMatch(String s) {
        if(s.length()==0) {
            throw new IllegalArgumentException("Empty String not allowed");
        }
        if(s==null) {
            throw new IllegalArgumentException("Null value not allowed");
        }
        int i = 0, j = s.length(), k = 0;

        int[] res = new int[s.length() + 1];
        for (char ch : s.toCharArray())
        {
            if (ch == 'I')
            {
                res[k++] = i++;
            }
            else
            {
                res[k++] = j--;
            }
        }
        res[k] = j;
        return res;
    }
}
