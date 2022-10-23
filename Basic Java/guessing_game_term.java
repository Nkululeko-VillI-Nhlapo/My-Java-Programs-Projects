
/*Guessing game, where the computer sums up two radom numbers, then you have to guess 
 the number, then the output will be either wrong/correct, then update your score.
   output = Correct: 0, Wrong: 1; (if you got the answer wrong)
 */

import java.util.*;
import java.util.random.*;
import java.util.Random;



public class guessing_game_term {
     
    
    
    public static void main(String [] args){

    

        Random random = new Random();
        Scanner userInput = new Scanner(System.in);

        int arbitrary_1, arbitrary_2, tally, count, answer, sum;
        String result;
        boolean expression = true;

        tally = 0;
        count = 0;

        System.out.println("\n#GuesssssssssingGameeeeeeeeee\n#Pals with Addition?, Show US!!!!!!");
        System.out.println("#I Diana will add FOR you the sum of two random numbers, then you have to give the correct answer\n#You'll have 3 ATTEMPTS");

        while (expression = true){
            arbitrary_1 = random.nextInt(100);
            arbitrary_2 = random.nextInt(100);
            sum = arbitrary_1 + arbitrary_2;

            
            result = "Correct";

            System.out.println("\nGive me the answer to:\n" + arbitrary_1 + " + " + arbitrary_2 );
            answer = userInput.nextInt();

            if ( answer == sum ){
                tally += 1;
                
            }
            else if (answer != sum){
                count += 1;
                result = "Wrong";
            }

            System.out.println("Correct: " + tally + " Wrong: " + count);

            if (count ==3){
                System.out.println("\nYou LOST!!!!!!, Score: " + count + " - " + tally +"\n");
                    break;
            }

            else if (tally == 3){
                System.out.println("\nYou WINN!!!!!!, Score: " + tally + " - " + count + "\n");
                    break;
            }

            
        }
    }

}
