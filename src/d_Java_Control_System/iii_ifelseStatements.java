package d_Java_Control_System;

public class iii_ifelseStatements {
    public static void main(String[] args) {

        /*
        if(firstCCondition){
            // code in block will be executed if
            // firstCondition is true
        } else {
            // code in bock will be executed if
            // firstCondition become false

         */


        boolean match = true;
        int score = 100;

        if ( (match) && (score == 100) ) {
            System.out.println("Your team performing well");

        } else {
            System.out.println("are you playing match");
        }

        // lets another example: if number is even or odd?

        int num = 23;

        if (num % 2 == 0 ) {
            System.out.println("it is an even number.");

        } else {
            System.out.println("it is an odd number");
        }

        // find grater number?

        num = 32;
        int num2 = 56;

        if(num > num2) {
            System.out.println("num is grater than num2");

        } else {
            System.out.println("num2 is greater than num");

        }

        // find fail or pass?

        boolean test = true;
        int number = 70;

        if ( (test) && (number >= 50) ) {
            System.out.println("status : pass.");
        } else {
            System.out.println("status : fail.");
        }



    }




}
