package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParanthesisIsValidTest {
   @Test
    public void testCase1LegalInput(){
       ParanthesisIsValid obj = new ParanthesisIsValid();
       boolean result = obj.isValid("{()}");
       Assertions.assertEquals(true,result);
   }
    @Test
    public void testCase2LegalInput(){
        ParanthesisIsValid obj = new ParanthesisIsValid();
        boolean result = obj.isValid("{(])}");
        Assertions.assertEquals(false,result);
    }
    @Test
    public void testCasePassingNullAsInput(){
       ParanthesisIsValid obj = new ParanthesisIsValid();
       Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> obj.isValid(null));
        Assertions.assertEquals("Null value not allowed", exception.getMessage());
    }
    @Test
    public void testCasePassingEmptyStringAsInput(){
        ParanthesisIsValid obj = new ParanthesisIsValid();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> obj.isValid(""));
        Assertions.assertEquals("Empty String not allowed", exception.getMessage());
    }
}