package in.samanvitha.udemy.course.sorting_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadixSortTest {
    @Test
    public void testCorrectOperation(){
        RadixSort rs = new RadixSort();
        int[] inputArray = {4725,4586,1330,1594,5729};
        rs.radixSort(inputArray,10, 4);
        Assertions.assertEquals(inputArray[0],1330);
        Assertions.assertEquals(inputArray[1],1594);
        Assertions.assertEquals(inputArray[2],4586);
        Assertions.assertEquals(inputArray[3],4725);
        Assertions.assertEquals(inputArray[4],5729);

    }

}