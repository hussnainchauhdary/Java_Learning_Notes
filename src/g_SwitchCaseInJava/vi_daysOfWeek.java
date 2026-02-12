public class vi_daysOfWeek {
    public static void printDay (int day){
        String storeResult = switch (day) {
            case 0 -> "sunday";
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> "invalid day";
        };

        System.out.println(day + " stands for " + storeResult);
    }

    // now write same case in if else :

   public static void printDays(int day){

        String dayOfWeek = "invalid day";

        if (day == 0){
            dayOfWeek = "sunday";

        }else if (day == 1){
            dayOfWeek = "monday";

        }else if (day == 2){
            dayOfWeek = "tuesday";

        }else if (day == 3){
            dayOfWeek = "wednesday";

        }else if (day == 4) {
            dayOfWeek = "thursday";

        }else if (day == 5){
            dayOfWeek = "friday";

        }else if (day == 6 ){
            dayOfWeek = "saturday";

        }else {
            dayOfWeek = dayOfWeek;

        }
        System.out.println(day + " stands for " + dayOfWeek);
   }

    public static void main(String[] args) {

        printDay(0);
        printDay(1);
        printDay(2);
        printDay(3);
        printDay(4);
        printDay(5);
        printDay(6);
        printDay(7);

System.out.println("now result of other method (if_else ");
        printDays(0);
        printDays(1);
        printDays(2);
        printDays(3);
        printDays(4);
        printDays(5);
        printDays(6);
        printDays(7);
    }
}
