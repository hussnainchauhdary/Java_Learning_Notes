package h_ForLoopInJava;/*
create a for loop range of numbers from 1 to 100;
print out the number that are divisible by 3 and 5;
also put a break point when you found five number that follow above condition;
and print the sum of those five numbers;
 */


public class h_sumOfDivBy3and5 {
    public static void main(String[] args) {
        int divisible = 0;
        int sumOfDivisible = 0;
        for(int i = 1 ; i <= 100 ; i++){
            if(i % 3== 0   && i % 5== 0 ) {
                System.out.println(i +" is divisible by 3 and 5");
                sumOfDivisible += i;
                divisible ++;
            if (divisible >= 5){
                break;
            }
            }
        }
        System.out.println("sum of first five number div by 3 and 5 are = " + sumOfDivisible);
    }
}
