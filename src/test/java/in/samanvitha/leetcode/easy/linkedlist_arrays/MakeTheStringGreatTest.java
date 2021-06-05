package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MakeTheStringGreatTest {
    @Test
    public void testCase1LegalInput(){
        MakeTheStringGreat obj = new MakeTheStringGreat();
        String result = obj.makeGood("abBbcdde");
        Assertions.assertEquals("abcdde",result);
    }

    @Test
    public void testCasePassingNullAsInput(){
        MakeTheStringGreat obj = new MakeTheStringGreat();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> obj.makeGood(null));
        Assertions.assertEquals("Null value not allowed", exception.getMessage());

    }
    @Test
    public void testCasePassingEmptyStringAsInput(){
        MakeTheStringGreat obj = new MakeTheStringGreat();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> obj.makeGood(""));
        Assertions.assertEquals("Empty String not allowed", exception.getMessage());

    }

}