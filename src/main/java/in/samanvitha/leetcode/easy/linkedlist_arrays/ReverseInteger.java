package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        int a = 321;
        int result = r.reverse(a);
        System.out.println("The result is "+result);
    }


    public static int reverse(int element) {
        int rev = 0, value = 0;
        while (element != 0) {
            value = element % 10;
            element /= 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
            rev = rev * 10 + value;

        }
        return rev;
    }
}