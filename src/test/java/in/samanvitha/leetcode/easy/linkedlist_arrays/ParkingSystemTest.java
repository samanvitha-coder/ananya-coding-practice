package in.samanvitha.leetcode.easy.linkedlist_arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParkingSystemTest {

    @Test
    public void testBigTwoMediumTwoSmallOne(){
        ParkingSystem park = new ParkingSystem(2,2,1);
        Assertions.assertEquals(true,park.addCar(1));
        Assertions.assertEquals(true,park.addCar(2));
        Assertions.assertEquals(true,park.addCar(3));
        Assertions.assertEquals(true,park.addCar(1));
        Assertions.assertEquals(true,park.addCar(2));
        Assertions.assertEquals(false,park.addCar(3));

    }

}