package in.samanvitha.leetcode.easy.linkedlist_arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumZeroTest {

    @Test
    public void testCaseLegalInput(){
        SumZero sz = new SumZero();
        int[] result = sz.sumZero(5);
        Assertions.assertEquals(0,result[0]);
        Assertions.assertEquals(4,result[1]);
        Assertions.assertEquals(-4,result[2]);
        Assertions.assertEquals(2,result[3]);
        Assertions.assertEquals(-2,result[4]);

    }

    @Test
    public void testCasePassingZeroAsInput(){
        SumZero sz = new SumZero();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> sz.sumZero(0));
        Assertions.assertEquals("Integer should be greater than zero", exception.getMessage());
    }
}