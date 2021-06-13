package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Arrays;

public class ThirdMax {
    public static void main( String[] args ) {
        ThirdMax obj = new ThirdMax();
        System.out.println(obj.thirdMax(new int[]{2,2,3,4}));
    }
    public int thirdMax(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int j=1;
        int k=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                j++;
                if(j==3){
                    k=i;
                    break;
                }
            }
        }
        if(j<3){
            return nums[nums.length-1];
        }
        return nums[k];

    }
}
