/*
Implementing A Speed Converter To Practice Basic Java Arithmetic And Output

1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
 This method needs to return the rounded value of the calculation of type long.

If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.

        Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.

 Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.

This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.

Then it needs to print a message in the format "XX km/h = YY mi/h".

XX represents the original value kilometersPerHour.
YY represents the rounded milesPerHour from the kilometersPerHour parameter.

If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".
 */

public class iv_SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0 ) {
            return -1;
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        }
    }
    public static void printConnversion (double kilometersPerHour) {
        if (kilometersPerHour < 0 ) {
            System.out.println("Invalid Value.");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConnversion(12.33);
    }
}
