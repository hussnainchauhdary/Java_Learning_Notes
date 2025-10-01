public class iii_ExamplePositiveNegative {
    /*
    write a method by name positiveNegative.
    with one parameter.
    tell positive if number is positive otherwise,Negative.
     */

    public static void positiveNegative( int num1) {
        if (num1 < 0 ) {
            System.out.println(" this is a positive number.");

        } else {
            System.out.println("this is a Negative number.");
        }
    }

    // now make other main method in same class to call "positiveNegative" method:

    public static void main(String[] args) {

        positiveNegative(12 );
    }

}
