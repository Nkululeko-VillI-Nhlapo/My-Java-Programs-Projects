import java.util.Scanner;

public class multiplicationTable {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome User");
        System.out.println("This a program in Java to display the multiplication table of a given number");

        int num, num1;
        System.out.println("\nPlease enter the number (Table to be calculated)");
        num1 = userInput.nextInt();
        System.out.println("Your table");
        for (num = 0;num<=num1; num++ ){
            
            System.out.println(num1+ " X "+ num + " = " + num1*num );
        }
    }
}
