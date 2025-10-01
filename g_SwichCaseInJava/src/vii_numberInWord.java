public class vii_numberInWord {
    public static void printNumberInWord (int number){
        String numberInWord = "other";

        switch (number){
            case 0 -> {
                numberInWord ="ZERO";
            }
            case 1 -> {
                numberInWord = "ONE";
            }
            case 2 -> {
                numberInWord = "TWO";
            }
            case 3 ->  {
                numberInWord ="THREE";
            }
            case 4 ->  {
                numberInWord ="FOUR";
            }
            case 5 -> {
                numberInWord = "FIVE";
            }
            case 6 -> {
                numberInWord = "SIX";
            }
            case 7 -> {
                numberInWord = "SEVEN";
            }
            case 8 -> {
                numberInWord = "EIGHT";
            }
            case 9 -> {
                numberInWord = "NINE";
            }
            default -> {
                numberInWord = "other";
            }
        };

    }

    public static void main(String[] args) {
        printNumberInWord(2);
    }

        // write code here
}

