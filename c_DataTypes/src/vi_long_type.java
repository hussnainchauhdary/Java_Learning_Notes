public class vi_long_type {
    public static void main(String[] args) {

        //  What is long data type?
        // long is a primitive data type used to store very large whole numbers (its range it greater than 'int' or 'short' or 'byte').
        // It uses 8 bytes (64 bits) of memory.
        // Wrapper class: Long

        // 1. Declaring a long variable
        long population = 8000000000L;     // Must add 'L' or 'l' at the end and than java will treat it like long otherwise it treated as integer.
        System.out.println("World population: " + population);

        // 2. To find the Range of long value ;

        long minimum_value = Long.MIN_VALUE ;
        long maximum_value = Long.MAX_VALUE ;

        System.out.println("The range of value in long data type is : " + minimum_value + " to " + maximum_value);
        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  "we can't assign the value more than range and bellow than range if do than it will through an error"

        // 3. To find the size of long data type ;

        long size_in_bits = Long.SIZE ;
        long size_in_bytes = Long.BYTES ;

        System.out.println("the size of long type in \"bits\" is : " + size_in_bits) ;
        System.out.println("The size of long type in \"bytes\" is : " + size_in_bytes) ;

        // 4. in java we can't assign the other any data type to long data type variable because it not allowed it for example:

        // float my_float_mum = 12.0 ;
        // byte my_long_num = my_float_num ;  // it will through an error ;
        // to solve this error we need to use [type casting] ;

        float my_float_num = 2.5f;
        long my_long_num = (long) (my_float_num) ;  // we do type casting here , by converting float to byte ;

        // 5. performing some operations on long data type ;

        long num1 = 144200000L ,  num2= 1234532L;

        long sum = (num1 + num2) ;
        long subtraction =  (num1 - num2) ;
        long multiplication =  (num1 * num2) ;
        long division =  (num1 / num2) ;
        long modulus =  (num1 %  num2) ;


        System.out.println("The Sum Of Two long num  : " +  num1 + " + " + num2 + " = " + sum);
        System.out.println("the subtraction of two long num " +  num1 + " - " + num2 + " = "  + subtraction) ;
        System.out.println("the multiplication of two long num " +   num1 + " * " + num2 + " = "  + multiplication) ;
        System.out.println("the division of two long num " +  num1 + " / " + num2 + " = " + division) ;
        System.out.println("the modulus of two long num  " +  num1 + " % " + num2 + " = " + modulus);



    }
}
