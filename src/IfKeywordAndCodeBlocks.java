public class IfKeywordAndCodeBlocks
{
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 5000;
        int levelcompleted = 5;
        int bonus = 1000;

        // if() else
        if (score < 5000) {
            System.out.println("Your Score was less than 5000");
        } else {
            System.out.println("Got here");
        }
        
        // if() else if() else
        if ( score < 5000 && score > 1000 ) {
            System.out.println("Your Score was less than 5000 but greater than 1000");
        } else if ( score < 1000 ) {
            System.out.println("Your Score was less than 1000");
        } else {
            System.out.println("Got here");
        }


    }
}
