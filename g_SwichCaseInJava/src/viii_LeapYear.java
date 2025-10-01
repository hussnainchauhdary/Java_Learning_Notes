import java.util.Scanner;

public class viii_LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return true;
        }
        else if (year % 4 == 0 && year % 100 != 0 ){
            return true;

        } else if (year % 400 == 0) {
                return true;
        }else {
                return  false;
        }


    }
    public static int monthInDays (int month , int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;

        }
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
               yield isLeapYear(year)? 29 : 28;

            }
            case 4, 6, 9, 11 -> 30;
            default -> -1;

        };
    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        System.out.print("please enter month in range 1 to 12 = ");
        int month = Scanner.nextInt();
        System.out.print("please enter year in range 9999 = ");
        int year = Scanner.nextInt();
        int converssion = monthInDays(month,year);
        System.out.println("In " + year + " no.of days in " + month +" month are " + converssion );
    }

}
