package f_OverloadedMethod;

public class iv_minuteAndSecondChallenge {
    /*
    in this challenge we ake time as parameter in seconds.
    we will then transform the seconds into hours
    than you show tha time in hours with remaining minutes and seconds in a string.
    we will do this in two steps which allows the overloaded method.
        */


    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "invalid value";


        } else {
            int toMinutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(toMinutes, remainingSeconds);
        }

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "invalid value.";
        } else {
            int toHours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return toHours + "h" + remainingMinutes + "m" + seconds + "s";
        }


    }

    public static void main(String[] args) {
        String toHours = getDurationString(3945);
        System.out.println( toHours);
    }
}
