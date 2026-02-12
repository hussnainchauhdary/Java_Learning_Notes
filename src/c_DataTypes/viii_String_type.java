package c_DataTypes;

public class viii_String_type {
    public static void main (String[] args) {
        //  What is a String?
        // A string is used to store text (a sequence of characters).
        // String is a class in java.lang package, not a primitive type.
        // Strings in java are immutable — once created, they cannot be changed.
        // in case of string text will must be enclosed in double inverted commas ;

        String my_name = "Hussnain Ahmad" ;
        System.out.println("my name is " + my_name) ;

        // in case of string we can't find out the range of string because it not have any limit of character .
        // it is not a type like int o float . string is a class.
        // we can find out its length.

        String adress = "i am living in Lahore" ;
        int length  = adress.length() ;

        System.out.println("the length of string of adress is : " + length) ;

        // in case of string '+' not works as addition it concatenated the character or string to each other.

        String intro = my_name + adress ;

        System.out.println ("my intorduction is :" + intro) ;

        String age = "20" , hight = "5.5" , Addition_test ;
        Addition_test = age + hight ;       // 205.5 , it not add because in java string not be added it can be concatenated.

        System.out.println("the result after using \"+\" sign in string is : " + Addition_test) ;




    }
}
