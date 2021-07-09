package in.samanvitha.udemy.course.Sorting_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    public void testCorrectOperation(){
        BubbleSort bs = new BubbleSort();
        int[] inputArray = {50,4,23,-8,56,9};
        int[] result = bs.bubbleSort(inputArray);
        Assertions.assertEquals(result[0],-8);
        Assertions.assertEquals(result[1],4);
        Assertions.assertEquals(result[2],9);
        Assertions.assertEquals(result[3],23);
        Assertions.assertEquals(result[4],50);
        Assertions.assertEquals(result[5],56);

    }
}