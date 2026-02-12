package c_DataTypes;

public class viii_char_type {
    public static void main (String[] args) {
        // what is char data type?
        // 'char' is a primitive data type used to store a single character , it enclosed in '' single inverted  commas.
        // It uses 2 bytes (16 bits) because it stores Unicode characters.
        // Wrapper class: Character

        // there are three ways to declaring a character .
        // 1. Declaring a  literal char variable ;

        char letter = 'A';      // must be in single quotes
        System.out.println("My character: " + letter) ;

        //  2. Using Unicode values

        char unicodeChar = '\u0041' ;     // letter 'A'.
        System.out.println("Unicode character: " + unicodeChar) ;

        // 3. using integer value from ASCII.

        char num = 65 ;   // casting 65 from integer to char.

        System.out.println("the 65 in ascii have assign to : " + num) ;

        // to find the range of char data type.

        int minimum_value = Character.MIN_VALUE ;
        int maximum_value = Character.MAX_VALUE ;

        System.out.println("The range of value in char data type is : " + minimum_value + " to " + maximum_value);
        // 0 to 65535  "we can't assign the value more than range and bellow than range if do than it will through an error"

        // to find the size of char data type ;

        int size_in_bits = Character.SIZE ;
        int size_in_bytes = Character.BYTES ;

        System.out.println("the size of char type in \"bits\" is : " + size_in_bits) ;
        System.out.println("The size of char type in \"bytes\" is : " + size_in_bytes) ;

        // in case f char the operations are different from integer etc.

        char my_char = 'A' ;
        char my2nd_char = 'A' + 1 ;    // A + 1 = B because  (A = 65) and 65+1 = 66 = B from ASCII.
        int my3rd_char = 'A' + 1 ;     // 66 because now it give the integer value of A + 1 = 66 from ASCII .
        System.out.println(my2nd_char) ;
        System.out.println(my3rd_char) ;




    }
}
