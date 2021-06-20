package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class ArrayStringsAreEqual {

    public static void main(String[] args){
        ArrayStringsAreEqual obj = new ArrayStringsAreEqual();
        String[] arr1 = {"a","b"};
        String[] arr2 = {"ab"};
        byte b =3;
        int c=100;
        int a = c>>b*3;
        System.out.println(a);
        int x = (c>>b)*3;
        System.out.println(x);
        System.out.println(obj.arrayStringsAreEqual(arr1,arr2));

    }



    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
