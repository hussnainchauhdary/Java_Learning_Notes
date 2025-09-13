public class c_CodeUnits {
    public static void main(String[] args) {


        /*
        Writing a code is just like writing a document. It consists of special hierarchical units, which together form a whole.
        There are ;
        EXPRESSION : Anything that give us a single value is now expression.
        STATEMENT : A complete instruction that perform some work.
        CODE BLOCK : A code block is a group oof statement inside the curly brackets{}, that run together.

                */
        // Expression:
        double kilometers = 100d * 1.609344d;
        System.out.println(kilometers);
        // here there are two expression in this statement
        // 1. 100d * 1.609344  it is an expression that give us 160.9344 .
        // 2. kilometers = 100d * 1.609344 , it assigns the 1.60.9344 to kilometers so it is also an expression.

        // Statement:
        double a ;                                                  // variable declaration statement.
        a = 10 + 5;                                                 // variable assignment statement.
        System.out.println("the value that assign to a : " + a);      // method call statement.

        // Code Block:
        {
            int num1 = 10;
            int num2 = 20;
            int sum = num1 + num2;
            System.out.println(sum);
        }
        // there are 4 statements in curly brackets that run together and form a code block




    }
}
