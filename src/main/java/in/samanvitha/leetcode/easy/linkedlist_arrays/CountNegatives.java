package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class CountNegatives {
    public static void main( String[] args ) {
        CountNegatives obj = new CountNegatives();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(obj.countNegatives(matrix));
    }
    public int countNegatives(int[][] grid) {

        if(grid[0].length==0) {
            throw new IllegalArgumentException("Empty Matrix not allowed");
        }
        if(grid==null)
        {
            throw new IllegalArgumentException("Null value not allowed");
        }
        int n = grid.length;
        int m = grid[0].length;
        int i=n-1;
        int j=0,count=0;
        while(i >= 0 && j < m)
            if(grid[i][j] < 0)
            {
                count = count + (m-j);
                i--;
            }
            else
                j++;
        return count;
    }
}
