package in.samanvitha.udemy.course.sorting_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
    @Test
    public void testCorrectOperation(){
        InsertionSort is = new InsertionSort();
        int[] inputArray = {50,4,23,-8,56,9};
        int[] result = is.insertionSort(inputArray);
        Assertions.assertEquals(result[0],-8);
        Assertions.assertEquals(result[1],4);
        Assertions.assertEquals(result[2],9);
        Assertions.assertEquals(result[3],23);
        Assertions.assertEquals(result[4],50);
        Assertions.assertEquals(result[5],56);

    }

}