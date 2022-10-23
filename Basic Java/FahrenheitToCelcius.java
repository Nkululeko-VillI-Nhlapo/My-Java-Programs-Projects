/* A program that converts a temperature from Fahrenheit to Celcius */
//Auther: Nhlapo Nkululeko

import java.util.*;

public class FahrenheitToCelcius {
    Scanner input = new Scanner(System.in);

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\nThis Calculater converts temperature from Fahrenheit to Celcius\nTry it Out!!!");

        
          float tempInFah;
          String tempQuest = "Enter any number you want to convert, e.g 212";
        
        
        System.out.println(tempQuest);
        tempInFah = input.nextFloat();
        double tempToCel = (tempInFah - 32) * 5/9;

        String answer = "Your temperature in Celcius is " + tempToCel + "\u00B0" + "C";
        System.out.println(answer);





    }


    
}
