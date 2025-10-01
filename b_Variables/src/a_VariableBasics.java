public class a_VariableBasics {
    public static void main(String[] args) {

        /* variable in java :
        1. In java each variable must be first declare than we can Initialize it✅.
        we can not name the variables by reserved keywords in java that have specific meaning in java
        like "int" it is a reserved key word represent a type .
        int int = 12  // it through an error.
        2. we canot start its name by a number like "1num" ❌.
        3. we cannot use any special character in variable "num#" ❌.
        4. we cannot dive space in variable name ❌.
        5. we can use underscore in variable "num_2" ✅.
        6. variable should be short and meaningful.

         */

        int num;       // declaration means variable should store integer value.
        num = 15;      // Initialization means assigning the 'num' variable by '15' value.

        // we can do it on a single line also:

        int num2 = 15;  // declaration and initialization on a single line.

        /* we can use a single variable in a program for many times but  not need to declare again
        if we declare same variable  again in a program than it give error❌.
        ⚠️means we can assign a same variable for multiple time✅ but can "declare by type" only for single time❌.
        int num = 12
        int num = 32   // this will through an error
        int num2 = 32  or num = 32  // these are a correct way.
         */


        // use  more than one variable :

        String name = "HUSSNAIN AHMAD";         // declaring + initializing on a single line.
        int age = 20;
        System.out.println(" name : " + name + " age : " +  age) ;

        // now we can do all of this on single line.

        String name2 = "hussnain ahmad" ; int age2 = 20;
        System.out.println("name : " + name2  + " age : " + age2);

        /* Some things that you have to know :
        if we declare more than one variable by different data type than we must separate  them by " ; ".
        int age ; String age; ✅
        if we decleare more than one variable by same data type than we must separate them by " , ".
        int age ,  sum;✅
        */

        int name3 = 2 , name4 = 5 , sum;
        sum = name3 + name4;
        System.out.print("sum of two num" + sum);

        // variable can be updated :

        int my_age= 20;
        my_age = 21;
        my_age = 22;
        my_age = 23;
        System.out.println("my updated age is :" + my_age);



    }
}
