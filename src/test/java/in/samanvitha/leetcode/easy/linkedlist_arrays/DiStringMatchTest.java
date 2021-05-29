package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiStringMatchTest {

    @Test
    public void InputLegalTestCase(){
        DiStringMatch ds = new DiStringMatch();
        int[] mat = {0,2,1};
        String s = "ID";
        int[] result = ds.diStringMatch(s);
        Assertions.assertEquals(mat[0],result[0]);
        Assertions.assertEquals(mat[1],result[1]);
        Assertions.assertEquals(mat[2],result[2]);
    }

    @Test
    public void testCasePassingEmptyStringAsInput() {
        DiStringMatch ds = new DiStringMatch();
        String s= "";
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> ds.diStringMatch(s));
        Assertions.assertEquals("Empty String not allowed", exception.getMessage());
    }

//    @Test
//    public void testCasePassingNullAsInput() {
//        DiStringMatch ds = new DiStringMatch();
//        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
//                () -> ds.diStringMatch(null));
//        Assertions.assertEquals("Null value not allowed", exception.getMessage());
//    }
}