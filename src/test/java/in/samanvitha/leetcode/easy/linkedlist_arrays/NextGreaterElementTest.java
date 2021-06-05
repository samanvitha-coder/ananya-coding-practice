package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {
    @Test
    public void testCaseLegalInput(){
        NextGreaterElement obj = new NextGreaterElement();
        int[] arr = obj.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        Assertions.assertEquals(arr[0],-1);
        Assertions.assertEquals(arr[1],3);
        Assertions.assertEquals(arr[2],-1);
    }

    @Test
    public void testCasePassingEmptyArrayAsArgument(){
        NextGreaterElement obj = new NextGreaterElement();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> obj.nextGreaterElement(new int[]{},new int[]{}));
        Assertions.assertEquals("Empty array not allowed", exception.getMessage());
    }
}