package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumDifferentIntegers {

    public static void main( String[] args ) {
        NumDifferentIntegers obj = new NumDifferentIntegers();
        System.out.println(obj.numDifferentIntegers("a123bc34d8ef34"));
    }
    public int numDifferentIntegers(String word) {
        Set set = new HashSet<>();

        for(int i = 0; i < word.length(); i++ ){

            char c =  word.charAt(i) ;
            if(c >= '0' && c <='9'){
                int j;
                boolean z = true;
                for(j = i; j < word.length();j++){
                    char ch =  word.charAt(j) ;
                    if(ch == '0' && z == true)
                        i++;
                    else if(ch >= 'a' && ch <= 'z')
                        break;
                    else
                        z = false;
                }
                String s;
                if( i == j)
                    s = word.substring(i-1,j);
                else
                    s = word.substring(i,j);
                set.add(s);
                i = j;
            }
        }


        return set.size();
    }
}
