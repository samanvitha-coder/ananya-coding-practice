package in.samanvitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class CountBalls {
    public static void main( String[] args ) {
        CountBalls obj = new CountBalls();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lowerLimit");
        int l = scanner.nextInt();
        System.out.println("Enter higherlimit");
        int h= scanner.nextInt();
        System.out.println(obj.countBalls(l,h));
    }

    public int countBalls( Integer lowLimit, Integer highLimit) {
        if(lowLimit==null || highLimit == null)
        {
            throw new IllegalArgumentException("Null value not allowed");
        }
        int[] count = new int[46];
        int num=0,max=0;
        for (int i = lowLimit; i <= highLimit; i++) {
            num=i;
            int sum = 0;
            while (num > 0)
            {
                sum += num % 10;
                num = (num/10);
            }
            count[sum]++;
        }
        for( int i = 1 ; i < count.length ; i++){

            if( max < count[i]){
                max = count[i] ;
            }
        }
        return max;

    }



}
