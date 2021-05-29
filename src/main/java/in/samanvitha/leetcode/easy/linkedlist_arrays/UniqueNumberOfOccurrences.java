package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        UniqueNumberOfOccurrences obj = new UniqueNumberOfOccurrences();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size= scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter "+size+" elements of the array");
        for(int i=0;i<size;i++){
            nums[i] = scanner.nextInt();
        }
        System.out.println(obj.uniqueOccurrences(nums));

    }

    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length==0)
            throw new IllegalArgumentException("Length of the array should be greater than zero");

        Arrays.sort(arr);
        HashSet<Integer> map = new HashSet<>();
        int count=1;
        int of=0;
        if(arr.length ==2 && arr[0] != arr[1])
            return false;

        for(int i=0; i< arr.length; i++)
        {

            if(i+1<= arr.length-1 && arr[i] == arr[i+1]) {
                count++;
            }
            else
            {
                if(!map.contains(count))
                {
                    map.add(count);
                    count=1;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}
