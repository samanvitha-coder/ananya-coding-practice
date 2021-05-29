package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class SumOfUniqueElements {
    public static void main( String[] args ) {
        SumOfUniqueElements obj = new SumOfUniqueElements();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(obj.sumOfUnique(arr));
    }


    public int sumOfUnique(int[] nums) {
        if(nums.length==0)
            throw new IllegalArgumentException("Length of the array should be greater than zero");
        int sum=0;
        int[] arr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    arr[i]++;
                    arr[j]++;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]==0)
                sum+=nums[i];
        }
        return sum;
    }
}
