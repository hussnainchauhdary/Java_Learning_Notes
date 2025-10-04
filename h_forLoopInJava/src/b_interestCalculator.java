/*
write a code that calculate the amount of interest
amount is 10,000 ; and calculate the amount of interest at 2, 3, 4, and 5 percent
do this by using for loop and also make another method to calculate interest amount
 */



public class b_interestCalculator {
    public static double interestAmount (double amount, double rate) {

        return amount * (rate / 100);

    }

    public static void main(String[] args) {
        for (double rate = 2d ; rate <= 5d ; rate ++) {
            System.out.println ("10,000.0 at " + rate + "% than  interest amount = " + interestAmount(10_000d , rate));

        }



    }





}
