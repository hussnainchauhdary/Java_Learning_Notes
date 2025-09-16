public class vi_IfElseifStatements {
    public static void main(String[] args) {
        /*
        if(firstCondition) {
            // code in block will execute ony if
            // firstCondition is true.
        }

        elseif(SecondCondition) {
            // code in block will execute only if firstCondition becomes false.
            // SecondCondition becomes true.

        } else {
            // code in block will execute only if
            // all above conditions becomes false.

        }
         */

        // now solve some questions:
        // student grade calculator?

        int marks = 75;

        if(marks >= 90) {
            System.out.println("Grade : A+");

        } else if ( (marks >= 80) && (marks < 90) ) {
            System.out.println("Grade : A" );

        } else if ( (marks >=70) && (marks < 80) ){
            System.out.println("Grade : B");

        } else if ( (marks >= 60) && (marks < 70) ) {
            System.out.println("Grade : C");

        } else if ( (marks >=50) && (marks < 60) ) {
            System.out.println("Grade : D");

        } else {
            System.out.println("Fail");
        }

        //  Age group calculator

        int age = 32;

        if ( (age >= 0) && (age <= 12) ) {
            System.out.println("you are child.");

        } else if ( (age >=13) && (age <= 19) ) {
            System.out.println("you are teenager.");

        } else if ( (age >=19)  && (age <= 59) ) {
            System.out.println("you are adult nd young.");

        } else {
            System.out.println("you are senior citizen");

        }

        // another example:

        boolean GameOver = true ;
        int FinalScore = 800;
        int LevelComplete = 5;
        int BounsPoint = 100;
        if (GameOver) {
            FinalScore += LevelComplete * BounsPoint;
            System.out.println("The FinlaScore is : " + FinalScore);

        }

        GameOver = true;
        FinalScore =  10_000;
        LevelComplete = 8;
        BounsPoint = 200;
        if(GameOver) {
            FinalScore += LevelComplete * BounsPoint;
            System.out.println("The updated FinalScore is : " + FinalScore);
        }


    }

    
}
