/*
write a code that print out the stars in hollow diamond pattern?
do this by using for loop
 */

import java.util.Scanner;

public class h_HollowDiamond {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        System.out.print("please enter width = ");
        int width = Scanner.nextInt();

        for(int a= 1 ; a <= width; a++){
            for(int b = a ; b < width  ; b++ ){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int c = 1; c < (2 * a - 1) ; c++){
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }
        for(int a = width ; a >= 1 ; a-- ){
            for(int b = a ; b < width ; b++ ){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int c = 1 ; c < (2*a-1); c++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Hi, it is a Diamond Shape. ");
        System.out.println("This code is written by Hussnain Ahamd.");
    }
}
