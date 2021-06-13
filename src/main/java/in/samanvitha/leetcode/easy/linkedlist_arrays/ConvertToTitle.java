package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class ConvertToTitle {
    public static void main( String[] args ) {
        ConvertToTitle obj = new ConvertToTitle();
        System.out.println(obj.convertToTitle(27));
    }
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            int rem = columnNumber % 26;
            columnNumber /= 26;
            if(rem == 0) {
                rem = 26;
                columnNumber--;
            }
            sb.insert(0, (char)('A' + rem - 1));
        }
        return sb.toString();
    }
}
