package c_DataTypes;

public class iv_byte_type {
    public static void main(String[] args) {
        // whAT IS BYTE ?
        // Byte is a primitive data type it store whole  number but its range is smaller than 'integer' and 'short' and 'long' data type.
        // It uses only 1 byte (8 bits) of memory.
        // It is mostly used to save memory in large arrays or with low-range values (like age, marks).
        // Wrapper class: Byte

        // 1. Declaring a byte variable
        byte age = 20;
        System.out.println("My age is: " + age);

        // 2. To find the Range of Byte value ;

        byte minimum_value = Byte.MIN_VALUE ;
        byte maximum_value = Byte.MAX_VALUE ;

        System.out.println("The range of value in Byte data type is : " + minimum_value + " to " + maximum_value);
        // -128 to 127  "we can't assign the value more than range and bellow than range if do than it will through an error"

        // 3. To find the size of byte data type ;

        byte size_in_bits = Byte.SIZE ;
        byte size_in_bytes = Byte.BYTES ;

        System.out.println("the size of byte type in \"bits\" is : " + size_in_bits) ;
        System.out.println("The size of byte type in \"bytes\" is : " + size_in_bytes) ;

        // 4. in java we can't assign the other any data type to byte data type variable because it not allowed it foor example:

        // float my_float_mum = 12.0 ;
        // byte my_short_num = my_float_num ;  // it will through an error ;
        // to solve this error we need to use [type casting] ;

        float my_float_num = 2.5f;
        byte my_short_num = (byte) (my_float_num) ;    // we do type casting here , by converting float to byte ;

        // 5. performing some operations on byte data type ;

        byte num1 = 12 ,  num2= 2;

        byte sum = (byte)(num1 + num2) ;
        byte subtraction = (byte) (num1 - num2) ;
        byte multiplication = (byte) (num1 * num2) ;
        byte division = (byte) (num1 / num2) ;
        byte modulus = (byte) (num1 %  num2) ;


        System.out.println("The Sum Of Two byte num  : " +  num1 + " + " + num2 + " = " + sum);
        System.out.println("the subtraction of two byte num " +  num1 + " - " + num2 + " = "  + subtraction) ;
        System.out.println("the multiplication of two byte num " +   num1 + " * " + num2 + " = "  + multiplication) ;
        System.out.println("the division of two byte num " +  num1 + " / " + num2 + " = " + division) ;
        System.out.println("the modulus of two byte num  " +  num1 + " % " + num2 + " = " + modulus); ;

    }
}
