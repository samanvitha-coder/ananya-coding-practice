package in.samanvitha.udemy.course.Sorting_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {
    @Test
    public void testCorrectOperation(){
        CountingSort cs = new CountingSort();
        int[] inputArray = {2,5,9,8,2,7,10,4,3};
        cs.countingSort(inputArray,0,10);
        Assertions.assertEquals(inputArray[0],2);
        Assertions.assertEquals(inputArray[1],2);
        Assertions.assertEquals(inputArray[2],3);
        Assertions.assertEquals(inputArray[3],4);
        Assertions.assertEquals(inputArray[4],5);
        Assertions.assertEquals(inputArray[5],7);
        Assertions.assertEquals(inputArray[6],8);
        Assertions.assertEquals(inputArray[7],9);
        Assertions.assertEquals(inputArray[8],10);

    }

}