package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class PowerOfTwo {
    public static void main( String[] args ) {
        PowerOfTwo obj = new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(9));
    }
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        while(n!=1)
        {
            if(n%2!=0)
                return false;

            n=n>>1;
        }
        return true;
    }
}
