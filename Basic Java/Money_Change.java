//Name: Nhlapo Nkululeko Villicent -  villicentnkululeko@gmail.com

// enter any amount of money, then it will be broken down into R200,R100,R50,R20,R10
//Enter only decimals

import java.util.*;

public class Money_Change {
    public static void main(String [] args) {
        System.out.println("Welcome User");
        System.out.println("This program breaks down for you, your total into the amount of notes in your amount..");
        Scanner userInput = new Scanner(System.in);
        int sum, leftOver, change, in10, in20, in50, in100, in200;
       System.out.println("\nPlease enter the amount e.g. R456, R887, only rounded off numbers are accepeted ");
       sum = userInput.nextInt();
       in200 = sum / 200;

       leftOver = sum % 200;

       sum =leftOver;

       in100 = sum/ 100;

       leftOver = sum % 100;

       sum =leftOver;


       in50 = sum / 50;

       leftOver = sum % 50;

       sum =leftOver;

       in20 =   sum / 20;

       leftOver =   sum % 20;

       sum =leftOver;

       in10 = sum / 10;

       leftOver = sum % 10;

       change =leftOver;

        System.out.println("Here's the breakdown:");
        System.out.println("R200: " + in200);
        System.out.println("R100: " + in100);
        System.out.println("R50: " + in50);
        System.out.println("R20: " + in20);
        System.out.println("R10: " + in10);

        System.out.println("here's what's remaining: R" + change);
        


    }
    
}