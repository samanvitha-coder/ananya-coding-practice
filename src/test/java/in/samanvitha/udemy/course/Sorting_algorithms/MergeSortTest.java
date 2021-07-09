package in.samanvitha.udemy.course.Sorting_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    public void testCorrectOperation(){
        MergeSort ms = new MergeSort();
        int[] inputArray = {50,4,23,-8,56,9};
        ms.mergeSort(inputArray,0, inputArray.length);
        Assertions.assertEquals(inputArray[0],-8);
        Assertions.assertEquals(inputArray[1],4);
        Assertions.assertEquals(inputArray[2],9);
        Assertions.assertEquals(inputArray[3],23);
        Assertions.assertEquals(inputArray[4],50);
        Assertions.assertEquals(inputArray[5],56);

    }

}