package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountBallsTest {
    @Test
    public void testCaseLegalInput(){
        CountBalls cb = new CountBalls();
        int result = cb.countBalls(1,10);
        Assertions.assertEquals(2,result);

    }
    @Test
    public void testCasePassingNullAsArgument() {
        CountBalls cb = new CountBalls();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> cb.countBalls(null,null));
        Assertions.assertEquals("Null value not allowed", exception.getMessage());

    }
}