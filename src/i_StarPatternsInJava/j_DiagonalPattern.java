package i_StarPatternsInJava;

import java.util.Scanner;

public class j_DiagonalPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value of width to print Diagonal pattern (value > 5) " );
        int width = scanner.nextInt();

        for(int row = 1 ; row <= width ; row ++){
            for(int col = 1 ; col <= width ; col ++){
                if( row == 1 || row == width){
                    System.out.print("*");

                }
                else if(col == 1 || col == width){
                    System.out.print(" ");

                }
                else if (row == col){
                    System.out.print("*");
                }
                else if (col == width - row + 1 ){
                    System.out.print("*");
                }
                else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
