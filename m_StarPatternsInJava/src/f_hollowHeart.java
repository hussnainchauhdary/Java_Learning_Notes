/*
 Write a code that print out stars in hollow heart pattern?
 please do this by using for loop;
 */

import java.util.Scanner;

public class f_hollowHeart {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("please enter width above 5 for clear pattern = ");
        int width = Scanner .nextInt();

        for(int i = width/2 ; i>=1; i--){

            for(int d = i; d >1; d--){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int e = width ; e >= (i*2) ; e--){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int f = i*2-1; f > 1; f--){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int g = width ; g>=(i*2); g--){
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }


        for(int a  = width ; a >=1 ; a--){
            for(int b = width ; b > a ; b--){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int c = 1; c<=(a*2-1); c++) {
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }

        for(int e =1 ; e<= width ; e++){
            System.out.print(" ");
        }
        System.out.print("*");

        System.out.println();
        System.out.println();

        System.out.println("Hi, this code written by Hussnain.");


    }
}
