package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class BuddyStrings {
    public static void main( String[] args ) {
        BuddyStrings obj = new BuddyStrings();
        System.out.println(obj.buddyStrings("acac","acca"));
    }
    public boolean buddyStrings(String s, String goal) {

        int[] freq = new int[26];
        int cnt = 0;
        char a = 'a', b = 'a';
        if (s.length() != goal.length())
            return false;
        if (s.equals(goal)) {
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
                if (freq[s.charAt(i) - 'a'] == 2)
                    return true;
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (cnt == 1) {
                        if (a == goal.charAt(i) && b == s.charAt(i))
                            cnt++;
                        else
                            return false;
                    } else if (cnt == 0) {
                        a = s.charAt(i);
                        b = goal.charAt(i);
                        cnt++;
                    } else cnt++;
                }
            }
        }
        return cnt == 2 ? true : false;
    }
}
