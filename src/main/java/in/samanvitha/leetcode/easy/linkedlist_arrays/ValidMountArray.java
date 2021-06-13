package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class ValidMountArray {
    public static void main( String[] args ) {
        ValidMountArray obj = new ValidMountArray();
        int[]  arr = {0,3,2,1};
        System.out.println(obj.validMountainArray(arr));
    }
    public boolean validMountainArray(int[] arr) {
        if(arr.length <3)
            return false;
        int i =0;
        int peak=0;
        int postPeakIndex=0;
        while(i<arr.length-1 )
        {
            if(arr[i]<arr[i+1])
                peak =arr[i+1];
            else if(arr[i]!=arr[i+1] && arr[i+1] < peak)
                postPeakIndex= postPeakIndex > 0 ?postPeakIndex+1 :i+1;
            else
                return false;
            i++;
        }
        return ((postPeakIndex==arr.length -1 && peak >0) ? true:false);
    }
}
