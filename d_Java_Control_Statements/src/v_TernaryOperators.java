public class v_TernaryOperators {
    public static void main(String[] args) {
        // what is ternary operator?
        //The ternary operator is a shorthand version of the if-else statement.
        //It allows you to write conditional logic in a single line.
        //It is also called the conditional operator.
        // format?
        // (condition) ? value_if_true : value_if_false;

        // supose a if else condition.

        int age = 18;
        if(age>= 18){
            System.out.println("this person is adult");
        }else{
            System.out.println("not adult");
        }

        // now write same code using ternary operator:

        age = 18;
        String age_test = (age >= 18) ? ("this person is adult") : ("not adult");
        System.out.println(age_test);


        // other exmple

        int ali_investment = 10_000 , arsal_investment = 90_000;
        if (ali_investment == arsal_investment){
            System.out.println("the can start business with equall shares");

        }else{
            System.out.println("plese collect equall investment amount");
        }

        // same code by using ternary operators:

        ali_investment = 10_000 ; arsal_investment = 90_000;
        String business = (ali_investment == arsal_investment) ? ("they can start business with equall shares") : ("please collect equal investment amount");
        System.out.println(business);

        // check num is even or odd ?

        int num = 20 ;
        String num_checking = (num % 2 == 0) ? ("this is even number.") : ("this is odd number.");
        System.out.println(num_checking);

        // find greater number:

        int num1 = 12 , num2 = 14;
        String check = (num1 > num2) ? ("num1 is greater than mun2") : ("num2 is greater than num2");
        System.out.println(check);


    }
}
