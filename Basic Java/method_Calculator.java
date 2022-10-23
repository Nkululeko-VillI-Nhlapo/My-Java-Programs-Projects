/* Java calculator using methods */
import java.util.*;



public class method_Calculator {
    public static void main(String [] args){
        System.out.println("\n/*-+Calculator using Methods/Subroutines+/*-\n");
        String first_num = getInput("Enter the first number: ");  // getting the user input
        String scnd_num = getInput("Enter the second number: ");
        String operator = getInput("Please choose between * + - and /: "); // getting the operator , the user will chose from (+,*,- and /)

        double result = 0;
        try { //using try for when or if an exception  occurs, in these switch statements
            switch(operator){ // using switch to check which operator is chosen then goingon to use it on the numbers
                case "+":
                    result = addition(first_num, scnd_num);
                        break;
                case "-":
                    result = subtraction(first_num,scnd_num);
                        break;
                case "*":
                    result = multiplication(first_num, scnd_num);
                        break;
                case "/":  
                    result =  division(first_num, scnd_num);
                        break;
                default :
                    System.out.println("You chooose the wrong operator, CHOOSE between + * - and /");
                    break;
                    
            }
            
            System.out.println("The result of " + first_num + " " + operator+ " " + scnd_num + " is " + result);

        } catch (Exception e) { //trying to handle the expception thAt might occur
                  System.out.println("Number formatting exception " +  e.getMessage()); //displaying the error
        }
    }

    //Creating methods, method for input, addition, subtraction, multiplication and division
    static String getInput(String prompt){
        System.out.print(prompt); // method from getting the input from the user
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine(); 
    }

    static double addition(String first_num, String scnd_num){ //method for addition
        double double_fist_n = Double.parseDouble(first_num); //converting the user input from String to Double
        double double_scnd_n =  Double.parseDouble(scnd_num);
        return double_fist_n + double_scnd_n ; // adding the userInput.
    }

    static double subtraction(String first_num, String scnd_num){ // method for addition
        double double_fist_n = Double.parseDouble(first_num);
        double double_scnd_n = Double.parseDouble(scnd_num);
        return double_fist_n -  double_scnd_n ; // subtracting the userInput
    }

    static double multiplication( String first_num, String scnd_num){ //method for subtraction
        double double_fist_n = Double.parseDouble(first_num);
        double double_scnd_n =  Double.parseDouble(scnd_num);
        return double_fist_n * double_scnd_n; // multiplying the userInput
    }

    static double division(String first_num, String scnd_num){
        double double_fist_n = Double.parseDouble(first_num);
        double double_scnd_n = Double.parseDouble(scnd_num);
        return double_fist_n / double_scnd_n;
    }
}
