package h_ForLoopInJava;/*
like tin switch statement we also use to word break to come out from the loop block;
in for loop we not use it directly we have to use an if statement tann use break
ame like as in switch we use case than in case we use break.
 */

public class c_breakInForLoop {
    public static double interestCalculator(double amount , double rate){

        return amount * (rate / 100);
        }


    public static void main(String[] args) {
        for(double rate = 7.5 ; rate <= 10 ; rate += .25){
            if (rate > 8.5){
                break;
                // now at that point our loop condition will be true but  loop will be break due to break point.
            }
            System.out.println ("100$ at " + rate + "% interest than interest amount = " + interestCalculator(100d , rate));
        }

    }
}
