import java.util.*;

//calculator using switch
public class Calculator{

    public static void main(String [] args ){
        Scanner userInput = new Scanner(System.in);

        System.out.println("\n+*/-Calculator-+*/\n");

        double first_num, scnd_num; //using double so that the calculator can work with both whole numbers and decimals
        System.out.println("Enter the first number: ");
        first_num = userInput.nextDouble() ;

        System.out.print("Enter the second number: "); // getting the second number from the user
        scnd_num =  userInput.nextDouble();

        System.out.println("Enter the operator: "); // getting the math operator, the user will chose from (+,*,- and /)
        char operator = userInput.next().charAt(0);

        double output;

        switch (operator){     // using switch to check which operator is chosen then goingon to use it on the numbers
            case '+' :
                output = first_num + scnd_num ;
                break;
            case '-' : ;
                output = first_num - scnd_num;
                    break;
            case '*' :
                output = first_num *  scnd_num;
                    break;
            case '/' :
                output = first_num / scnd_num;
                    break;
            default:
                System.out.println("You have entered the wrong operator, " + operator);
                return; // this ,message will be returned if a user enter a wrong operator
            
        }

        System.out.println(first_num +" " + operator+ " "+ scnd_num+ " = " + output); //printing out the calculation


    }

}