/*
write a code that print out a table of a number from 1 to 10:
 */

public class e_printTable {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1 ; i <=10 ; i++){

            System.out.println(number + " * " + i + " = " + table(i , number) );
        }
    }
    public static int table ( int i ,int number){
        return i * number;

    }
}
