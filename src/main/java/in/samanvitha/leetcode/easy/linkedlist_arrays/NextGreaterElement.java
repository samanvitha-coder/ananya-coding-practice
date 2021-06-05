package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class NextGreaterElement {
    public static void main( String[] args ) {
        NextGreaterElement obj = new NextGreaterElement();
        int[] arr = obj.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    if(nums1.length==0 || nums2.length==0){
        throw new IllegalArgumentException("Empty array not allowed");
    }
        int[] greaterElements = new int[10001];

        for(int i=0;i<=10000;i++)
            greaterElements[i]=-1;

        for(int i=0;i<nums2.length;i++)
        {
            int num = nums2[i];
            for(int j=i+1;j<nums2.length;j++)
            {
                if(nums2[j]>num)
                {
                    greaterElements[num] = nums2[j];
                    break;
                }
            }
        }

        int[] answer = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            answer[i]=greaterElements[nums1[i]];
        }
        return answer;
    }
}
