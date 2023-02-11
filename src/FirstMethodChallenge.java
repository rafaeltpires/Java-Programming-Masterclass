public class FirstMethodChallenge
{

    public static void main(String[] args)
    {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Name1", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Name2", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Name3", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Name4", position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("Name5", position);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition)
    {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        if (playerScore >= 1000) {
            return 1;
        }
        if (playerScore >= 500) {
            return 2;
        }
        if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}
