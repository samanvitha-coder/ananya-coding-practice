package in.samanvitha.leetcode.easy.linkedlist_arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UniqueNumberOfOccurrencesTest {

    @Test
    public void testCaseLegalInputTrue(){
        UniqueNumberOfOccurrences un = new UniqueNumberOfOccurrences();
        boolean result = un.uniqueOccurrences(new int[]{1,2,1,2,2});
        Assertions.assertEquals(true,result);
    }

    @Test
    public void testCaseLegalInputFalse(){
        UniqueNumberOfOccurrences un = new UniqueNumberOfOccurrences();
        boolean result = un.uniqueOccurrences(new int[]{1,2});
        Assertions.assertEquals(false,result);
    }

    @Test
    public void testCasePassingEmptyArrayAsArgument(){
        UniqueNumberOfOccurrences un = new UniqueNumberOfOccurrences();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> un.uniqueOccurrences(new int[]{}));
        Assertions.assertEquals("Length of the array should be greater than zero", exception.getMessage());
    }
}