package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class ArrayStringsAreEqual {

    public static void main(String[] args){
        ArrayStringsAreEqual obj = new ArrayStringsAreEqual();
        String[] arr1 = {"a","b"};
        String[] arr2 = {"ab"};
        System.out.println(obj.arrayStringsAreEqual(arr1,arr2));

    }



    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
