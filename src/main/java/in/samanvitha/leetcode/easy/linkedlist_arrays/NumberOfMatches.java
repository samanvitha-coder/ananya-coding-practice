package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class NumberOfMatches {
    public static void main(String[] args) {
        NumberOfMatches obj = new NumberOfMatches();
        Scanner scanner = new Scanner(System.in);
        System.out.println(obj.numberOfMatches(scanner.nextInt()));
    }

    public int numberOfMatches(int n) {
        int cnt=0,win;
        while(n>1){
            win=n/2;
            cnt+=win;
            n=n-win;
        }
        return cnt;
    }
}
