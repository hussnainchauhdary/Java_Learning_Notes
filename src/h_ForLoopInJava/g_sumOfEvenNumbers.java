package h_ForLoopInJava;/*
write code that print out the ssum of only even number from 1 to 50:
 */

public class g_sumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1 ; i <= 50 ; i++){
            if (isEven(i)){
                sum += i;
            }
        }
        System.out.println(sum);

    }
    public static boolean isEven(int number){
        return number % 2 == 0;

    }

}
