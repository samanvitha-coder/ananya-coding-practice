package in.samanvitha.leetcode.easy.linkedlist_arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class DestinationCityTest {

    @Test
    public void InputLegalTestCase() {
        DestinationCity dst = new DestinationCity();
        List<List<String>> listoflists = new ArrayList<List<String>>();
        List<String> list1 =  Arrays.asList("a","b");
        listoflists.add(list1);
        String result = dst.destCity(listoflists);
        Assertions.assertEquals("b",result);
    }

}