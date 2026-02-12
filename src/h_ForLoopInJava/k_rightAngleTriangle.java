package h_ForLoopInJava;

public class k_rightAngleTriangle {
    public static void main(String[] args) {

        int noOfLines = 5;

        for(int i = 1; i <= noOfLines; i++ ){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
