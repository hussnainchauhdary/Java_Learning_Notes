public class iv_switchForMonths {
    public static String getQuarter(String month) {
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "April":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4rd";
        }
        return "bad";




    }
    // the same code can be also written in another type :
    public static String GetQuarter(String month) {
        return switch(month) {
            case "january" , "february" , "march" -> "1st";
            case "april" , "may" , "june" -> "2nd";
            case "july" , "august" , "september" -> "3rd";
            case "october" , "november" , "december" -> "4rth";
            default -> "bad";
        };
    }
    // now we write a main method to see the output of both method is same on same input or not :
    // so lets see:

    public static void main(String[] args) {
        System.out.println(getQuarter("JANUARY"));
        System.out.println(GetQuarter("january"));

        // so both have same output means january is in 1st quarter
    }
}
