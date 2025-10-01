public class ii_BasicExample {
    // create overloaded method that calculate scores and tell name of players.

    public static void main(String[] args) {
        // call the methods here;

        System.out.println(calculateScore("Rizwan" , 140));
        System.out.println(calculateScore(150));
        calculateScore();
    }

    public static int calculateScore(String playerName , int score) {
        System.out.println("player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        return (calculateScore("Baber" , score));

    }
    public static void calculateScore(){
        System.out.println("no player name and no player score. ");


    }
}
