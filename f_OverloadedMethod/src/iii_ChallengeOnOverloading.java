public class iii_ChallengeOnOverloading {
    /*
    write two methods with same name: convertToCentimeters.
    the first method have one parameter of type 'int' which represent the height in inches.
    you have to convert inches into centimeters in this method and pass back (return) the height in centimeters as a 'double'.
    Now:
    write a 2nd method has to parameter of tpe int, one to represent  height in feet and one represent remaining height in inches, so if a person has height
    5 feet 4 inch so, values 5 for feet and 4 for  inch pass to method.
    this method convert feet and inches into the inches and then use 1st method to convert it into centimeters. and return values as double.

     */

    public static void main(String[] args) {
        System.out.println ("5in = " + convertToCentimeters(5) + "cm");
        System.out.println ("6ft, 0in = " + convertToCentimeters(6, 0) + "cm");
    }

    public static double convertToCentimeters(int heightInInches) {
        double ToCentimeter = heightInInches * 2.54;
        return ToCentimeter;
    }
    public static double convertToCentimeters(int heightInFeet , int heightInInches) {
        int toInches = (heightInFeet * 12) + heightInInches;
        return convertToCentimeters(toInches);
    }
}
