/*
if we need to check multiple case for a variable or expression n single line so we can also do it by grouping multiple cases.
we can group the multiple cases in a single line.
 */


public class ii_groupingCasesInOneLine {
    public static void main(String[] args) {
        int value = 3 ;
        switch (value) {
            case 1 :
                System.out.println("value assigned by 1 ");
                break;
            case 2: case 3: case 4: case 5:   // grouping the multiple cases on one line.
                System.out.println("Value was 2 or 3 or 4 or may be 5");
                System.out.println("Actually the value was " + value );
                break;
            default :
                    System.out.println("value vas not 1 or 2 or 3 or 4 or 5 it is something else");

        }
    }
}
