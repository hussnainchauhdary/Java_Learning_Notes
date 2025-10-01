public class v_yieldInSwitch {
    public static String getQuarter (String month) {
        return switch (month) {
            case "jan" , "feb" , "march" -> {
                String respond = "1st";
                yield respond;
            }
            case "april" , "may" , "june" -> "2nd" ;
            case "july" , "aug" , "sep" -> "3rd" ;
            case "oct" , "nov" , "dec" -> "4rth" ;
         // default -> bad;     we do like this butt if we add expression in any case we have to write in block and and in place of return we have to write yield.
           default -> {
               String badInput = month + "is bad";
               yield badInput;

           }    // so in short , if you doing addition code in case branch you need tto use code block and yield keyword.

        };
    }
}
