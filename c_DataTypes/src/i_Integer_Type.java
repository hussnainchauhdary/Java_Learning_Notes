public class i_Integer_Type {

    public static void main (String[] args) {

        //  What is int?
        // Int is a primitive data type used to store whole number.
        // It uses 4 bytes (32 bits) in memory.
        // Wrapper class: Integer


        // to find the range of integer type;

        int Minimum_value = Integer.MIN_VALUE;
        int Maximum_value = Integer.MAX_VALUE;

        System.out.println("The Range Of Integer Value is : " + Minimum_value + " to " + Maximum_value) ;

        // to find the size of integer data type ;

        int size_in_bits = Integer.SIZE ;
        int size_in_bytes = Integer.BYTES ;

        System.out.println("The size of integer in bits is : " + size_in_bits) ;
        System.out.println("the size of integer type in bytes is : " + size_in_bytes) ;

        // some operations on int type ;

        int num1 = 12 , num2 = 23;

        int sum = num1 + num2 ;
        int subtraction = num1 - num2 ;
        int multiplication = num1 * num2 ;
        int division = num1 / num2 ;
        int modulus = num1 % + num2 ;


        System.out.println("The Sum Of Two Integer " +  num1 + " + " + num2 + " = " + sum);
        System.out.println(" the subtraction of two integer num " +  num1 + " - " + num2 + " = "  + subtraction) ;
        System.out.println("the multiplication of two integer num " +   num1 + " * " + num2 + " = "  + multiplication) ;
        System.out.println("the division of two integer num is " +  num1 + " / " + num2 + " = " + division) ;
        System.out.println("the modulus of two integer num  " +  num1 + " % " + num2 + " = " + modulus); ;





    }
}
