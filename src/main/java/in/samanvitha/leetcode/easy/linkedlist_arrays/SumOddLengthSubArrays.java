package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class SumOddLengthSubArrays {
    public static void main(String[] args) {
        SumOddLengthSubArrays obj = new SumOddLengthSubArrays();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size= scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter "+size+" elements of the array");
        for(int i=0;i<size;i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(obj.sumOddLengthSubarrays(nums));

    }

    public int sumOddLengthSubarrays(int[] arr) {
        int cnt,n=arr.length,res=0,s;
        for(int i=0;i<n;i++){
            s = (n-i)*(i+1);
            cnt=s/2;
            if(s%2!=0)
                cnt++;
            res += cnt*arr[i];
        }
        return res;
    }
}
