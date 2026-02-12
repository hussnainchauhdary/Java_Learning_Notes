package i_StarPatternsInJava;/*
write a code that print out star in hollow triangle shape;
do this by using for loop
*/

import java.util.Scanner;

public class d_hollowTriangle {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Please enter height = ");
        int height = Scanner.nextInt();

        System.out.print("please enter width = ");
        int width = Scanner .nextInt();

        if(height == width) {
            for (int a = 1; a <= height; a++) {
                for (int b = a; b < width; b++) {
                    System.out.print(" ");
                }
                for (int c = 1; c <= (2 * a - 1); c++) {
                    if (a == 1 || a == width || c == 1 || c == (2 * a - 1)) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else{
            System.out.print(" sorry! please enter equal measurements. Thanks");
        }
    }
}
