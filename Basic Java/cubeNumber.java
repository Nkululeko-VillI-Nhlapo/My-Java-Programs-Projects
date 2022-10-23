
import java.util.*;
import java.lang.Math;

public class cubeNumber {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome User");

        System.out.println("This program will display for you the cube of the number upto given  integer.");

        System.out.println("\nJust input any number");
        int number, cubeNum, num;
        
        number = userInput.nextInt();

        num = 0;

        

        while (num != number) {
            cubeNum = number^3;
            num++;
            System.out.println("Number is "+ num + " it's cube is "+ (int) Math.pow(num, 3));
            

            
        }    
    }
}
