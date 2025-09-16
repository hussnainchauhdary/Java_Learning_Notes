/*
write a method that test that is cat playing or not
make two parameter one to check for summer
and other for temperature if summer means temp range to 25-45 otherwise 25-35.

 */

public class vii_playingCat {
    public static boolean isCatPlaying (boolean summer , int temperature) {
        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;

    }
/*
I do it by using ternary method. I also do it by using simple if else method for clear concept
 */
    public static boolean isCatPlaying ( int temperature , boolean summer) {
        if (summer && temperature >=25 && temperature <= 45){
            return true;
        } else if (!summer && temperature >= 25 && temperature <= 35) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 25));
        System.out.println(isCatPlaying(25, true));
    }

}
