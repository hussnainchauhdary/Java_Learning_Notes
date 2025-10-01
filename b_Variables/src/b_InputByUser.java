import java.util.Scanner;

public class b_InputByUser {
    public static void main(String[] args) {

        // in previous we assign a value to variable in code but in this flie we learn that
        // to take input a value by user.

        // in simple way we assign a value to a vraiable.
        String FirstName = "Hussnain";
        String LastName = "Ahmad";
        String FullName = FirstName + " " + LastName;
        System.out.println("my name is " + FullName);

        // now take same input(first and last name by user).
        // Scanner class is used to take input by user. that import in start of code.

        // Step 1: Create a Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Step 2: Ask user to for a string input.
        System.out.println("Enter you FistName :");
        String First = input.nextLine();
        System.out.println("Enter your LastName : ");
        String Last = input.nextLine();

        System.out.println("Your Full Name is : " + First + " " + Last );

        // other example  input two numbers by user:

        System.out.println("Enter a number : ");
        int num1 = input.nextInt();   // taking input a number by user
        System.out.println("Enter second number : ");
        int num2 = input.nextInt();   // taking input by user
        int sum = num1 + num2;

        // printing the sum value.
        System.out.println("the sum of " + num1 + " and " + num2 + " is : " + sum);

        // other example input by user two Float numbers;

        System.out.println("Enter First Float value : ");
        float weight1 = input.nextFloat();      // take 1st float value by user
        System.out.println("Enter second float value : ");
        float weight2 = input.nextFloat();      // take 2nd float value by user
        float TotalWeight = weight1 + weight2;

        // printing the total weight value;
        System.out.println("the total weight is : " + TotalWeight);

        input.close();   // close the scanner class to avoid resource leaks.
    }

}
