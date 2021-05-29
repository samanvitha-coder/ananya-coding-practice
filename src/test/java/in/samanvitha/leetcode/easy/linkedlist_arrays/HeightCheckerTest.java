package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HeightCheckerTest {
    @Test
    public void testCaseLegalInput(){
        HeightChecker hc = new HeightChecker();
        int result = hc.heightChecker(new int[]{1, 1, 3, 2, 1});
        Assertions.assertEquals(2,result);
    }

    @Test
    public void testCaseEmptyArray(){
        HeightChecker hc = new HeightChecker();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> hc.heightChecker(new int[]{}));
        Assertions.assertEquals("Empty Array not allowed", exception.getMessage());
    }

}