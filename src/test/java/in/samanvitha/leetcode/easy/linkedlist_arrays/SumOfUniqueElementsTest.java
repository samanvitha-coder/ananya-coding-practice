package in.samanvitha.leetcode.easy.linkedlist_arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumOfUniqueElementsTest {

    @Test
    public void testCaseLegalInput(){
        SumOfUniqueElements so = new SumOfUniqueElements();
        int result = so.sumOfUnique(new int[]{1,2,3,2,5});
        Assertions.assertEquals(9,result);

    }

    @Test
    public void testCasePassingEmptyArrayAsArgument(){
        SumOfUniqueElements so = new SumOfUniqueElements();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> so.sumOfUnique(new int[]{}));
        Assertions.assertEquals("Length of the array should be greater than zero", exception.getMessage());
    }
}