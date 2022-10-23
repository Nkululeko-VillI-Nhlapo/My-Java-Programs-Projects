import java.util.*;

public class rockpaperscissors {
    
    public static void main(String [] args){
        Scanner inpu = new Scanner(System.in);
        System.out.println("Welcome to RockPaperScissor Wrold\nCome along and enjoy our multiplayer with your friend");
		String playerTwoC;
		String playerOneC;
		String playerOne;
		String playerTwo;
        boolean gameOver = false;

        while (!gameOver)
        {
            System.out.println("Player 1 Name: ");
             playerOne = inpu.next().toUpperCase();
			 System.out.println('\n');
            System.out.println("Player 2 Name: ");
        	 playerTwo =  inpu.next().toUpperCase();
			 System.out.println('\n');
            System.out.println("Player 1 Choice [R/P/S]? ");
            playerOneC = inpu.next().toUpperCase();
			System.out.println('\n');
            System.out.println("Player 2 Choice [R/P/S]? ");
            playerTwoC = inpu.next().toUpperCase();


            if (playerOneC.equals("P") && playerTwoC.equals("S"))
            {
                System.out.println("Scissors cuts paper, " + playerTwo +  " WINS!" );
				gameOver = true;
            }
            else if (playerOneC.equals("S") && playerTwoC.equals("P"))
			{
				System.out.println("Scissors cuts paper, player 1 wins!");
				gameOver = true;
			}
			else if (playerOneC.equals("P") && playerTwoC.equals("R"))
			{
				System.out.println("Paper covers rock, " + playerOne +  " WINS!" );
				gameOver = true;
            }
			
			else if (playerOneC.equals("R") && playerTwoC.equals("P"))
			{
				System.out.println("Paper covers rock," + playerTwo +  " WINS!" );
				gameOver = true;
			}

			else if (playerOneC.equals("R") && playerTwoC.equals("S"))
			{
				System.out.println("Rock breaks scissors,"+ playerOne +  " WINS!" );
				gameOver = true;
			}
			else if (playerOneC.equals("S") && playerTwoC.equals("R"))
			{
				System.out.println("Rock breaks scissors,"+ playerTwo +  " WINS!" );
				gameOver = true;
			}
			else
			{
				System.out.println("It is a tie!  We go again.");
			}



        }
    }
}
    
