import java.util.Scanner;

public class RocksPaperScissors
{
	public static void main(String[] args)
	{
		String player1Choice;
		String player2Choice;
		boolean gameOver = false;
		Scanner keyboard = new Scanner(System.in);

		while (!gameOver)
		{
			System.out.println("Player 1, choose P,R, or S.");
			player1Choice = keyboard.next().toLowerCase();  // Convert to lowercase
			System.out.println("Player 2, choose P,R, or S.");
			player2Choice = keyboard.next().toLowerCase();

			// Check for winner
			if (player1Choice.equals("p") && player2Choice.equals("s"))
			{
				System.out.println("Scissors cuts paper, player 2 wins!");
				gameOver = true;
			}
			else if (player1Choice.equals("s") && player2Choice.equals("p"))
			{
				System.out.println("Scissors cuts paper, player 1 wins!");
				gameOver = true;
			}
			else if (player1Choice.equals("p") && player2Choice.equals("r"))
			{
				System.out.println("Paper covers rock, player 1 wins!");
				gameOver = true;
			}
			else if (player1Choice.equals("r") && player2Choice.equals("p"))
			{
				System.out.println("Paper covers rock, player 2 wins!");
				gameOver = true;
			}
			else if (player1Choice.equals("r") && player2Choice.equals("s"))
			{
				System.out.println("Rock breaks scissors, player 1 wins!");
				gameOver = true;
			}
			else if (player1Choice.equals("s") && player2Choice.equals("r"))
			{
				System.out.println("Rock breaks scissors, player 2 wins!");
				gameOver = true;
			}
			else
			{
				System.out.println("It is a tie!  We go again.");
			}
		}
	}
}