import java.util.Scanner;

/*
write a code that pint out a star in triangle shape
do this by using for loop
 */
public class c_triangle {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);

        System.out.print("please enter height = ");
        int height = Scanner .nextInt();

        System.out.print("please enter width = ");
        int width = Scanner.nextInt();
        if(height == width) {
            for (int a = 1; a <= height; a++) {
                for (int b = a; b < width; b++) {
                    System.out.print(" ");

                }
                for (int c = 1; c <= (2 * a - 1); c++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            System.out.println("Sorry! please enter equal measurements");
        }


    }
}
