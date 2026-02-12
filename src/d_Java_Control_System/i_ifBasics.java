package d_Java_Control_System;

public class i_ifBasics {
    public static void main(String[] args) {

        /*if statements is used to apply a condition for a block of code that can be executed only if condition is true .
        if (true){
            // this block will be executed if this condition should be true
        */

        if (true){
            System.out.println("hi! i am always executed beacause i am true");
        }

        if (false){
            System.out.println("Hi! i never be executed because i am false");

        }

        int age = 20 ;
        if (age == 20)  {
            System.out.println("this is a young ");
        }


        if (age > 18 ){
            System.out.println("you are an adult.");
        }

        if (age < 18) {                 // not execute because condition is false.
            System.out.println("you  are not adult");
        }

        if ((age != 18) && (age > 18) ){
            System.out.println("you are not not child and now you are adlut");
        }

        // check if number is even?

        int num = 12;
        if (num % 2 == 0){
            System.out.println("this is an even number");
        }

        // check if num is odd?

        num = 21;
        if (num % 2 != 0){
            System.out.print("this is an odd number");
        }

        boolean iscar = false;
        if (iscar = true) {
            System.out.println("this is not support to happen");
        }

        // now use logical operators
        // to start a business check both patterns invest equall amount.

        int ali_amount = 1000 , arsal_amount = 1000;
        if ((ali_amount == arsal_amount) || (ali_amount > arsal_amount) ||(ali_amount < arsal_amount)){

            System.out.println("incase of equall investment they can start business on equall shares, otherwise they can't  start on equall shares");

        }

        // now check which team won the match

        int pak_score = 500 , eng_score = 502;
        if((pak_score < eng_score) && (eng_score > pak_score)){
            System.out.println("eng won the match or pak lose the match");

        }

    }

}
