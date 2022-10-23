/*
* Nhlapo Nkululeko Villiccent - villicentnkululeko@gmail.com
* the program calculates the minimum and maximum number if the inputed numbers then sums them.
 */


import java.util.*;

public class mini_Maxi {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        //Welcome Message
        System.out.println("Welcome User");
        System.out.println("This program will take a list of postive numbers and\nthen it will display the smallest number, largest and also sum up the average.");

        int smallNum, largestNum, num, tally;
        float average, sum;
        smallNum= 76632623;
        largestNum = 0;                                 //VARIABLES,DECLARATION.
        num = 0;
        average= 0f;
        sum = 0f;
        tally = 0;
        boolean option = true;
        
       
        
        System.out.println("Enter multiple numbers(only positive), press -1 when done :");
        while (option != false) { //LOOPING TILL -1 IS PRESSED
            num = userInput.nextInt(); //TAKING IN USER INPUT, IN NUMBERS
        
            // CHECKING IF CONDITIONS ARE MET
            if (num <= -1) {
                System.out.println("\nDONE!, Now we process your numbers!!\n");
                break; // FOR THE PROGRAM TO STOP TAKING IN NUMBERS
            } else {
                tally += 1;
                
            }
        
            if (num < smallNum) { 
                smallNum = num;  // A SMALL NUMBER WILL BE REGISTERED
                
            }
        
            
        
            if (num > largestNum){
                largestNum = num; 
                
            }
        
           sum =sum + num;  //Getting the total sum of the entered numbers
           average = (sum / tally); // Calculating the average

           
        
        }
            //OUTPUTS
        System.out.println("The Largest number : " + largestNum);
        System.out.println("The Smallest  : " + smallNum);
        System.out.println("The Average is : " + average);
        
        
        
        } 
}
