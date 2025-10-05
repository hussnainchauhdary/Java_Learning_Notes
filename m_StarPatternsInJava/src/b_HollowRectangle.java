import java.util.Scanner;

public class b_HollowRectangle {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Please enter height = ");
        int height = Scanner. nextInt();

        System.out.println("please enter width = ");
        int width = Scanner.nextInt();

        System.out.println();

        if(height == width){
            System.out.println("Hy! you enter  equal measurements so it is Hollow square pattern.");
        }else {
            System.out.println("Hy! you enter you enter unequal measurements so it is Hollow Rectangle pattern. ");

        }
        System.out.println();

        for(int a = 1; a <= height ; a++){
            for(int b = 1 ; b <= width ; b++){
                if(a== 1 || a == height || b == 1 || b == width){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
