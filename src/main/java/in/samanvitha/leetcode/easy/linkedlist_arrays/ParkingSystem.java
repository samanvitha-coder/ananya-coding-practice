package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class ParkingSystem {
    public static void main( String[] args ) {
        ParkingSystem obj = new ParkingSystem(1,2,3);
        System.out.println(obj.addCar(1));
        System.out.println(obj.addCar(2));
        System.out.println(obj.addCar(3));
        System.out.println(obj.addCar(1));
    }

    int[] slots = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        slots[0] = big;
        slots[1] = medium;
        slots[2] = small;

    }

    public boolean addCar(int carType) {
        int slot = slots[carType-1];
        if(slot>0){
            slots[carType-1] = slot - 1;
            return true;
        }
        return false;

    }
}
