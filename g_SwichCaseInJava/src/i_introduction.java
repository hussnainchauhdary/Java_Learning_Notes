/*
Actually switch case is another way to make decisions in java just like if_else.
 so instead of writing more if_else statements we have to make only one switch case for a variable
 and apply the conditions (Cases) for value of variable or expression.

 a complete switch structure:

 */

public class i_introduction {
    public static void main(String[] args) {

        int value = 3;
        switch (value) {
            case 1 :
                // code for value == 1;
                break;    // break is a keyword in switch that means if this case so code not proceed further away to next case and  move out from switch block.
            case 2:
                // code for value == 2;
                break;
            case 3 :
                // code for value == 3;
                System.out.println("hy i am a switch case.");
                break;

                // and soo on as you want.

            default:
                // code for default case ;

                // default keyword in switch works same as else case in if_else means if no case true so default will be run.
                break;
        }
    }




}
