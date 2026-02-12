package c_DataTypes;

public class iii_double_type {
    public static void main (String[] args) {
        //  What is double?
        // double is a primitive data type in Java used to store decimal numbers.
        // It is more precise than float (15–16 decimal digits).
        // It uses 8 bytes (64 bits) of memory.
        // Wrapper class: Double

        //  1. Declaring a double variable ;
        // in java we can't assign the other data type in double if we assign other than double it will through an error for example ;
        // float num1 = 12f;
        // double num2 = num1 ;    // it through an error in java because it not allow to assign different data type ;
        // to solve it we have to use "Type Casting"

        float MyNum1 = 12f ;
        double MyNum2 = (double)MyNum1 ;
        System.out.println(MyNum2) ;

        double pi = 3.141592653589793D ;
        System.out.println("Value of Pi: " + pi);

        // 2. To find the Range of double data type;

        double minimum_value = Double.MIN_VALUE ;
        double maximum_value = Double.MAX_VALUE ;

        System.out.println("The range of double data type value is : " + minimum_value + " To " + maximum_value);

        // 3. To find the size of double data type ;

        double size_in_bits = Double.SIZE ;
        double size_in_bytes = Double.BYTES ;

        System.out.println("the size of double data type in bits is : " + size_in_bits) ;
        System.out.println("the size f double in bytes is : " + size_in_bytes) ;

        // 4. performing some operations on double ;

        double num1 = 13d ;
        double num2 = 45d ;
        double addition = (num1 + num2) ;
        double subtraction = num1 - num2 ;
        double multiplication = num1 * num2 ;
        double division = num1 / num2 ;

        System.out.println("The addition Of Two double num " +  num1 + " + " + num2 + " = " + addition);
        System.out.println(" the subtraction of two double num " +  num1 + " - " + num2 + " = "  + subtraction) ;
        System.out.println("the multiplication of two double num " +   num1 + " * " + num2 + " = "  + multiplication) ;
        System.out.println("the division of two double num  " +  num1 + " / " + num2 + " = " + division) ;

        // conclusion : 'double' type use to find result more precisely it give more accurate precision than 'float' ;
        // BigDouble give more precisely accurate result than double so in case of 'amount' only always use "BigDouble" data type ;


    }
}
