package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackSpaceStringCompareTest {
    @Test
    public void testCase1LegalInput(){
        BackSpaceStringCompare obj = new BackSpaceStringCompare();
        boolean result = obj.backspaceCompare("ab#c","ad#c");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void testCase2LegalInput(){
        BackSpaceStringCompare obj = new BackSpaceStringCompare();
        boolean result = obj.backspaceCompare("abb#c","ad#c");
        Assertions.assertEquals(false,result);
    }
    @Test
    public void testCasePassingNullAsInput(){
        BackSpaceStringCompare obj = new BackSpaceStringCompare();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> obj.backspaceCompare(null,null));
        Assertions.assertEquals("Null value not allowed", exception.getMessage());

    }
    @Test
    public void testCasePassingEmptyStringAsInput(){
        BackSpaceStringCompare obj = new BackSpaceStringCompare();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> obj.backspaceCompare("",""));
        Assertions.assertEquals("Empty String not allowed", exception.getMessage());

    }
}