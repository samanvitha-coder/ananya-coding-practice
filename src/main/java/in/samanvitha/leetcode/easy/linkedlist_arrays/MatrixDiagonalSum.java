package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        MatrixDiagonalSum obj = new MatrixDiagonalSum();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = scanner.nextInt();
        System.out.println("Enter number of columns");
        int n = scanner.nextInt();
        System.out.println("Enter elements of the matrix");
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(obj.diagonalSum(matrix));
    }
    public int diagonalSum(int[][] mat) {
        if(mat[0].length==0) {
            throw new IllegalArgumentException("Empty Matrix not allowed");
        }
        if(mat==null)
        {
            throw new IllegalArgumentException("Null value not allowed");
        }

        int sum=0;
        int len = mat.length-1;
        for(int i=0;i<mat[0].length;i++){
            sum+=mat[i][i];
            if(i!=len-i)
                sum+=mat[i][len-i];

        }
        return sum;

    }
}
