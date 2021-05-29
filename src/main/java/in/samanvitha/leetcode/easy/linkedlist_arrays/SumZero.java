package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class SumZero {
    public static void main( String[] args ) {
        SumZero obj = new SumZero();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        arr = obj.sumZero(size);
        System.out.print("[ ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("]");
    }




    public int[] sumZero(int n) {
        if(n==0)
            throw new IllegalArgumentException("Integer should be greater than zero");
        int arr[] = new int[n];
        if(n%2!=0){
            arr[0]=0;
            for(int i=1;i<n-1;i+=2){
                int val = n-i;
                arr[i] = val;
                arr[i+1] = -arr[i];
            }
        }else{
            for(int i=0;i<n;i+=2){
                arr[i] = n-i;
                arr[i+1] = -(n-i);
            }
        }
        return arr;

    }
}
