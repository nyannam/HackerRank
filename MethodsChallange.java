public class MethodsChallange {

    public static void main(String[] args) {
        int score ;
        int levelCompleted ;
        int bonus ;
        boolean gameOver ;

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("sahith",highScorePosition);

    }

    public static void displayHighScorePosition(String playerName , int position){

        System.out.println(playerName + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int score){
        if(score>=1000) {
            System.out.println("player score is " +score);
            return 1;
        } else if(score>=500 && score<1000) {
            System.out.println("player score is " +score);
            return 2;
        } else if(score>=100 && score<500){
            System.out.println("player score is " +score);
            return 3;
        } else{
            System.out.println("player score is " +score);
            return 4;
        }
    }
}
