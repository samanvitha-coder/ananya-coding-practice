package in.samanvitha.leetcode.easy.linkedlist_arrays;

public class CanPlaceFlowers {
    public static void main( String[] args ) {
        CanPlaceFlowers obj = new CanPlaceFlowers();
        int[] arr = new int[]{0,1,0,0,0,1};
        System.out.println(obj.canPlaceFlowers(arr,1));
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean adjacent = false;
        int initial = n;
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 1) {
                if(adjacent && initial > n) {
                    n++;
                } else {
                    adjacent = true;
                }
            } else if (n > 0) {
                if(!adjacent) {
                    n--;
                }
                adjacent = !adjacent;
            } else if (n == 0) {
                return true;
            }
        }
        return n == 0;
    }
}
