package e_MethodsInJava;
/*

Parameters in methods :
    It means to declare variables in the method.
    A method parameter is a variable that you define inside the method's parentheses () to receive a value when the method is called.

    Formate of parameter in method :

        public static void methodName(parameterType parameterName) {
        // method body
        }

 Arguments in methods :
     It means assigning  the values to variable that declare in method .
     Arguments are the actual values that we can pass to parameters when we call a method.

     Formate of Arguments :

        methodName( Pass there value according to type that give to variable in method);
 */

// For Example : Make a method that calculate score and then call it ?

public class ii_parameterArgument{

    // now naming the method and declare parameters:
    public static void calculatedScore(boolean gameOver , int score , int levelCompleted , int bonus) {

        // body of method
        int finalScore = score;
        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was : " + finalScore);
        }
    }

    // now use this method in the other method where we need :

    public static void main(String[] args) {


        // calculate a score when: gameOver = true , score = 10000 , levelCompleted = 8 , bonus = 200;
        // now we call method to calculate score :

        calculatedScore(true ,10000 , 8, 200);

        // calculate score when : gameOver = true , score = 123 , levelCompleted = 1 , bonus = 5 ?
        // now we again call same method to calculate score ;

        calculatedScore(true , 123, 1 , 5);

    }
}








