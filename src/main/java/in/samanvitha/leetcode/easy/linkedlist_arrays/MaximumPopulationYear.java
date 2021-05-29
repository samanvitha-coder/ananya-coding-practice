package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        MaximumPopulationYear obj = new MaximumPopulationYear();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(obj.maximumPopulation(matrix));
    }

    public int maximumPopulation(int[][] logs) {
        if(logs[0].length==0)
            throw new IllegalArgumentException("Empty Matrix not allowed");

        if(logs == null || logs.length == 0) return 0;

        int[] populations = new int[101];
        for(int[] log: logs) {
            int startYearIndex = log[0]-1950;
            int endYearIndex = log[1]-1950;

            while(startYearIndex < endYearIndex)
                populations[startYearIndex++]++;
        }

        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < populations.length; ++i) {
            if(populations[i] > max) {
                max = populations[i];
                maxIndex = i;
            }
        }

        return maxIndex+1950;
    }
}
