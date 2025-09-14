public class ii_float_type {
    public static void main (String[] args){

        //  What is float?
        // Float is a primitive data type used to store decimal numbers with 6–7 digits of precision.
        // It uses 4 bytes (32 bits) in memory.
        // Wrapper class: Float

        float wrapper_num = 12f ;    // we have to write 'f' because by default java take any whole number as integer so we can't assign integer to float;
        float float_num = 12f;

        System.out.println("wrapper_value : " + wrapper_num) ;
        System.out.println("float value : " + float_num);

        // to find the range of float value ;

        float minimum_value = Float.MIN_VALUE ;
        float maximum_value = Float.MAX_VALUE ;


        System.out.println("The Range of float date type is : " + minimum_value + " to " + maximum_value);



        // to find the size of float data type ;

        float size_in_bits = Float.SIZE ;
        float size_in_bytes = Float.BYTES ;

        System.out.println("The Size Of Float data type in bits : " +  size_in_bits) ;
        System.out.println("The Size Of Float data type in bytes : " +  size_in_bytes) ;

        // some operations on float type ;

        float num1 = 13f ;
        float num2 = 45f ;
        float addition = num1 + num2 ;
        float subtraction = num1 - num2 ;
        float multiplication = num1 * num2 ;
        float division = num1 / num2 ;

        System.out.println("The addition Of Two float num " +  num1 + " + " + num2 + " = " + addition);
        System.out.println(" the subtraction of two float num " +  num1 + " - " + num2 + " = "  + subtraction) ;
        System.out.println("the multiplication of two float num " +   num1 + " * " + num2 + " = "  + multiplication) ;
        System.out.println("the division of two float num  " +  num1 + " / " + num2 + " = " + division) ;


        // in Java we can't assign one data type to another data type it will through an error  ;
        // int num1 = 12;
        // float num2 = num1;    // it through an error " to solve it we need to do  [Type casting] "

        int num6 = 12 ;
        float num7 = (float) num6 ;   // we do type casting here ;



    }
}
