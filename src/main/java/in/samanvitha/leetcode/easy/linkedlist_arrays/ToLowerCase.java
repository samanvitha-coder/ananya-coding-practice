package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        ToLowerCase obj = new ToLowerCase();
        Scanner scanner = new Scanner(System.in);
        System.out.println(obj.toLowerCase(scanner.next()));
    }
    public String toLowerCase(String str) {
        return(str.toLowerCase());
    }
}
