package in.samanvitha.udemy.course.sorting_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortUsingRecursionTest {
    @Test
    public void testCorrectOperation(){
        InsertionSortUsingRecursion is = new InsertionSortUsingRecursion();
        int[] arr = {50,4,23,-8,56,9};

        is.insertionSort(arr,arr.length);
        Assertions.assertEquals(arr[0],-8);
        Assertions.assertEquals(arr[1],4);
        Assertions.assertEquals(arr[2],9);
        Assertions.assertEquals(arr[3],23);
        Assertions.assertEquals(arr[4],50);
        Assertions.assertEquals(arr[5],56);

    }


}