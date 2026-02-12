package h_ForLoopInJava;

/*
write a code that that print th sum of odd numbers ;
do this by using isOdd method that test that is number is odd or not it wll r type of boolean;
now mak other method that give the sum of odd number existing between a specific range;
also print out the odd number btw the range;
use for loop to do ths task;
 */
public class j_sumOddRange {
    public static boolean isOdd(int number){
        return number > 0 && number % 2 != 0;
    }
    public static int sumOddNumbers(int start , int end){
        int sum = 0;
        if (start > 0 && end > 0){

            for(int i = start ; i <= end ; i++ ){
                if (isOdd(i)){
                    System.out.println(i);
                   sum += i;

                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int start = 1;
        int end = 50;
        System.out.println( "the sum of odd number from " + start + " to " + end + " = " + sumOddNumbers(start , end)  );
    }

}
