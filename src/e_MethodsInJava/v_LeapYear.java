package e_MethodsInJava;

/*
write a method to check that is Year is leap year or not .
at start also check the year is value is valid or not.
if year leap year than return true otherwise,return false.
 */
public class v_LeapYear {
    public static boolean isLeapYear (int year) {
        if (year < 1 && year > 9999) {
            return false;
        }
        else if ((year % 4 == 0) && (year % 100 != 0 )){
            return true;
        }
        else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // main method to  call method.

    public static void main(String[] args) {
        boolean checkYear = isLeapYear(2025);
        if(checkYear) {
            System.out.println("this is a leap year.");
        }else {
            System.out.println("this is not a leap year.");
        }
    }
}
