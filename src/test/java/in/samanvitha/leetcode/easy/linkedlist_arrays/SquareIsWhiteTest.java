package in.samanvitha.leetcode.easy.linkedlist_arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareIsWhiteTest {

    @Test
    public void testCaseLegalInput(){
        SquareIsWhite si = new SquareIsWhite();
        Boolean result = si.squareIsWhite("a2");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void testCasePassingEmptyStringAsInput(){
        SquareIsWhite si = new SquareIsWhite();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> si.squareIsWhite(""));
        Assertions.assertEquals("Empty string is not allowed", exception.getMessage());
    }

    @Test
    public void testCaseLengthCheck(){
        SquareIsWhite si = new SquareIsWhite();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> si.squareIsWhite("a11"));
        Assertions.assertEquals("Length of the string should be 2", exception.getMessage());
    }
}