import java.util.Scanner;

/*
Write a code that print out the stars n Diamond pattern?
do this by using for Loop;
 */
public class g_Diamond {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("please enter width = ");
        int width = Scanner .nextInt();

        for(int a = 1 ; a <= width ; a++){

            for(int b = a ; b <= (width - 1) ; b++  ){
                System.out.print(" ");
            }
            for(int c = 1 ; c <= ( 2 * a - 1) ; c++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int a = width ; a >= 1 ; a--){

            for(int b = a ; b < width ; b++){
                System.out.print(" ");
            }
            for(int c = 1 ; c <= (2 * a - 1) ; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
