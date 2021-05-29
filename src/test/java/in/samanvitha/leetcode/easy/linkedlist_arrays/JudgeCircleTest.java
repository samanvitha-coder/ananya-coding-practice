package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JudgeCircleTest {

    @Test
    public void testCaseLegalInputTrue(){
        JudgeCircle jc = new JudgeCircle();
        String s="UD";
        Assertions.assertEquals(true,jc.judgeCircle(s));
    }

    @Test
    public void testCaseLegalInputFalse(){
        JudgeCircle jc = new JudgeCircle();
        String s="UDL";
        Assertions.assertEquals(false,jc.judgeCircle(s));
    }

    @Test
    public void testCaseIllegalInput(){
        JudgeCircle jc = new JudgeCircle();
        String s="UDLF";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> jc.judgeCircle(s));
        Assertions.assertEquals("Only U D L R characters are allowed", exception.getMessage());
    }

    @Test
    public void testCasePassingEmptyStringAsInput(){
        JudgeCircle jc = new JudgeCircle();
        String s="";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> jc.judgeCircle(s));
        Assertions.assertEquals("Empty string not allowed", exception.getMessage());
    }
}