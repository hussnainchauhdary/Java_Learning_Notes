public class v_short_type {
    public static void main(String[] args) {
        //  What is short data type?
        // short is a primitive data type used to store small whole numbers.
        // It is larger than byte but smaller than int.
        // Memory Size: 2 bytes (16 bits)
        // Wrapper class: Short

        // 1. Declaring a short variable ;

        short age = 25 ;
        System.out.println("My age is: " + age) ;

       // 2. To find the Range of short value ;

        short minimum_value = Short.MIN_VALUE ;
        short maximum_value = Short.MAX_VALUE ;

        System.out.println("The range of value in short data type is : " + minimum_value + " to " + maximum_value);
        // -32_768 to 32_767 "we can't assign the value more than range and bellow than range if do than it will through an error"

        // 3. To find the size of short data type ;

        short size_in_bits = Short.SIZE ;
        short size_in_bytes = Short.BYTES ;

        System.out.println("the size of short type in \"bits\" is : " + size_in_bits) ;
        System.out.println("The size of short type in \"bytes\" is : " + size_in_bytes) ;

        // 4. in java we can't assign the other any data type to short data type variable because it not allowed it foor example:

        // float my_float_mum = 12.0 ;
        // short my_short_num = my_float_num ;  // it will through an error ;
        // to solve this error we need to use [type casting] ;

        float my_float_num = 2.5f;
        short my_short_num = (short) (my_float_num) ;    // we do type casting here , by converting float to short ;

        // 5. performing some operations on short data type ;

        short num1 = 12 ,  num2= 23;

        short sum = (short)(num1 + num2) ;
        short subtraction = (short) (num1 - num2) ;
        short multiplication = (short) (num1 * num2) ;
        short division = (short) (num1 / num2) ;
        short modulus = (short) (num1 %  num2) ;


        System.out.println("The Sum Of Two short num  : " +  num1 + " + " + num2 + " = " + sum);
        System.out.println("the subtraction of two short num " +  num1 + " - " + num2 + " = "  + subtraction) ;
        System.out.println("the multiplication of two short num " +   num1 + " * " + num2 + " = "  + multiplication) ;
        System.out.println("the division of two short num is " +  num1 + " / " + num2 + " = " + division) ;
        System.out.println("the modulus of two short num  " +  num1 + " % " + num2 + " = " + modulus); ;




    }
}
