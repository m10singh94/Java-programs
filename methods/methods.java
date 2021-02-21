public class methods
{
    public static void main(String[] args) 
    {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Maitreyi", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Shashwat", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Mummy", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Papa", position);
    }
    public static int calculateHighScorePosition (int playerScore)
    {
        if(playerScore >= 1000)
            return 1;
        else if(playerScore >= 500)
                return 2;
            else if(playerScore >= 200)
                    return 3;
        return 4;
    }
    public static void displayHighScorePosition(String playerName, int position) 
    {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }
}