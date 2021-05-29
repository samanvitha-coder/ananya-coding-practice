package in.samanvitha.leetcode.easy.linkedlist_arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeStringsAlternatelyTest {

    @Test
    public void testCaseLegalInput(){
        MergeStringsAlternately ms = new MergeStringsAlternately();
        String result = ms.mergeAlternately("abc","pqr");
        Assertions.assertEquals("apbqcr",result);
        }

    @Test
    public void testCasePassingEmptyStringAsInput(){
        MergeStringsAlternately ms = new MergeStringsAlternately();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> ms.mergeAlternately("",""));
        Assertions.assertEquals("Empty strings are not allowed", exception.getMessage());
    }
}