package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HeightChecker {
    public static void main( String[] args ) {
       HeightChecker obj = new HeightChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(obj.heightChecker(arr));
    }

    public int heightChecker(int[] heights) {
        if(heights.length==0){
            throw new IllegalArgumentException("Empty Array not allowed");
        }
        int[] arr = new int[heights.length];
        int cnt=0;
        for(int i=0;i<heights.length;i++){
            arr[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i])
                cnt++;
        }
        return cnt;
    }
}
