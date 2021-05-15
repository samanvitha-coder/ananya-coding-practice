package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountConsistentStrings {
    public static void main(String[] args) {
        CountConsistentStrings obj = new CountConsistentStrings();
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter size");
        size = scanner.nextInt();
        String[] arr = new String[size];
        for(int j = 0; j <size;j++)
        {
            arr[j] = scanner.next();
        }
        System.out.println("Enter string to be matched");
        String all = scanner.next();
        System.out.println(obj.countConsistentStrings(all,arr));

    }

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int res = 0;
        for (String w : words) {
            boolean match = true;

            for (char ch : w.toCharArray()) {
                if (!set.contains(ch)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                res++;
            }
        }

        return res;







        /*
        int val=0,c;
        String a="";
        for(int i=0;i<words.length;i++){
             boolean match = true;
            a=words[i];
            c=a.length();
            for(int j=0;j<c;j++){
                 char b = a.charAt(j);
                if(!(allowed.contains(Character.toString(b)))){
                    match = false;
                    break;
                }
            }

            if(match)
                val+=1;
        }
        return val;
        */
    }
}
