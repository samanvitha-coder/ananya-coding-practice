package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class PowerOfTwoTest {
    @Test
    public void testCaseLegalInput() {
        PowerOfTwo pt = new PowerOfTwo();
        boolean result = pt.isPowerOfTwo(9);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void testCaseLegalInputTrue() {
        PowerOfTwo pt = new PowerOfTwo();
        boolean result = pt.isPowerOfTwo(2);
        Assertions.assertEquals(true, result);
    }

}