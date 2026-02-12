package i_StarPatternsInJava;/*
Write a method named printSquareStar with one parameter of type int named number.

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).


 */
import java.util.Scanner;

public class i_Diagonal_X_InSquare {
    public static void diagonalPattern(int number){
        if (number < 5){
            System.out.print("sorry please enter number above 5. Thanks!");
        }
        else {
            for(int row = 1 ; row <= number ; row ++){
                for(int col = 1 ; col <= number; col ++){
                    if(row == 1 || row == number){
                        System.out.print(" *");

                    }
                    else if (col == 1 || col == number){
                        System.out.print(" *");
                    }
                    else if( col == row){
                        System.out.print(" *");

                    }
                    else if (col == number - row + 1){
                        System.out.print(" *");
                    }
                    else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
        }



    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Please enter a measurement above 5 = ");
        int number = Scanner.nextInt();
        diagonalPattern(number);
    }
}
