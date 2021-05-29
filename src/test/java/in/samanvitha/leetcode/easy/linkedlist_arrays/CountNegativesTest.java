package in.samanvitha.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CountNegativesTest {

    @Test
    public void testCaseLegalInput(){
        CountNegatives mat = new CountNegatives();
        int mat1[][] = {{1,2,-3},{4,-5,-6},{7,-8,-9}};
        int result = mat.countNegatives(mat1);
        Assertions.assertEquals(5,result);

    }

    @Test
    public void testCasePassingEmptyMatrixAsInput() {
        CountNegatives mat = new CountNegatives();
        int mat1[][] = {{}};
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> mat.countNegatives(mat1));
        Assertions.assertEquals("Empty Matrix not allowed", exception.getMessage());
    }


}