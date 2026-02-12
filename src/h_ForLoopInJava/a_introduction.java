package h_ForLoopInJava;/*
loops in java used to repeat a bock of code or several times.
there are three types of loop in java:
    1) for loop
    2) while loop
    3) do-while loop

👑 for loop :
    for loop in java used to repeat a bock of code for a specific number of times.
    for loop is commonly used when you already know how many times the code executed.

⚠️ syntax in for loop:

    for (initialization , condition OR expression , increment) {
        // code be executed;
    }

♦️ initialization : initialization also said to be (loop variable) means the value you initialize from that loop is start once run .
♦️ Condition : condition means you have to apply a condition when it becomes true, than code will be executed. it will be check before every iteration.
♦️ Increment : it means to create increment in initialization value or loop variable before every iteration.

 */

// for example print out 1 to 5 numbers by using for loop.


public class a_introduction {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 5; i++) {

            // 'i' is a initialization variable that contain loop starting value means loop run from 1
            // than we apply condition to run loop means if i <=5 (1,2,3,4,5) than code will be executed otherwise it will be not executed.
            // at the last we make increment to update initialization value (you can update by increasing or decreasing the value .
            // if my condition will be true that my code in the curly braces  will be executed .

            System.out.println(i);
        }
    }
}
