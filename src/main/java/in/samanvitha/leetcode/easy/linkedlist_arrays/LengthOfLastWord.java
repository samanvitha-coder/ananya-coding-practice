package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class LengthOfLastWord {
    public static void main( String[] args ) {
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println(obj.lengthOfLastWord("Hello World"));
    }
    public int lengthOfLastWord(String s) {
        int result =0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == 32 && result == 0)
                continue;
            if(s.charAt(i) == 32)
                return result;
            result++;
        }

        return result;
    }
}
