/*
write a code that print out stars in heart pattern;
do this by using for loop;
 */

import java.util.Scanner;

public class e_heart {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        System.out.print("please enter width");
        int width = Scanner .nextInt();
        for(int i = width/2 ; i >= 1 ; i--){
            for(int b = 1 ; b <= i; b++){
                System.out.print(" ");

            }for(int c = width/2+1 ; c >=i ;c--){
                System.out.print("*");

            }for(int d = width/2 ; d >1;d-- ){
                System.out.print(" ");

            }for(int f= width / 2+1; f>= i ; f--){
                System.out.print("*");
            }

            System.out.println();
        }



        for(int a = width ; a > 0;  a--){
            for(int b = a ; b < width ; b++){
                System.out.print(" ");
            }for(int c = 1; c <=(2* a- 1) ; c++ ){
                System.out.print("*");
            }
            System.out.println();
        }



    }


}
