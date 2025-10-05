/*
write a code that print out a star in rectangle shape:
do this by using for loop
 */
import java.util.Scanner;
public class a_Rectangle {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);

        System.out.print("Please enter height = ");
        int height = Scanner.nextInt();

        System.out.print("Please Enter width = ");
        int width = Scanner . nextInt();

        System.out.println();

        if(height == width){
            System.out.println("Hy! you enter  equal measurements so it is square pattern.");
        }else {
            System.out.println("Hy! you enter you enter unequal measurements so it is Rectangle pattern. ");

        }
        System.out.println();

        for(int a = 1; a <= height ; a++){
            for(int b= 1 ; b <= width; b++){
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
