package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.sql.SQLOutput;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums= new int[]{2,7,11,15};
        int target=9;
        int a[] =obj.twoSum(nums,target);
        System.out.println("The indices are "+a[0] + " " + a[1]);

    }
    public static int[] twoSum(int[] nums, int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                    return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
