package f_OverloadedMethod;/*
write code that convert the minutes into the years and days
this code print the giving minutes into the years and remaining days.
 */

public class vi_MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays (long minutes){
        if (minutes < 0 ) {
            System.out.println("Invalid Value.");

        } else {
            long toHours = minutes / 60;
            long toDays = toHours / 24;
            long toYears = toDays / 365;
            long remainingDays = toDays % 365;
            System.out.println (minutes + " min = " + toYears + " y and " + remainingDays + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(456983999);
    }
}