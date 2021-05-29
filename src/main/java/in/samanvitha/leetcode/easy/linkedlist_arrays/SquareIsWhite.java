package in.samanvitha.leetcode.easy.linkedlist_arrays;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Scanner;

public class SquareIsWhite {
    public static void main( String[] args ) {
        SquareIsWhite obj = new SquareIsWhite();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scanner.next();
        boolean b = obj.squareIsWhite(s);
        if(b)
            System.out.println("Square is white");
        else
            System.out.println("Square is black");
    }




    public boolean squareIsWhite(String coordinates) {
        if(coordinates.length()>2){
            throw new IllegalArgumentException("Length of the string should be 2");
        }
        if(coordinates.length()==0)
            throw new IllegalArgumentException("Empty string is not allowed");
        Character letter = coordinates.charAt(0), num = coordinates.charAt(1);
        int x = letter - 'a' + 1, y = Character.digit(num, 10);
        return (x + y) % 2 == 1;
    }
}
