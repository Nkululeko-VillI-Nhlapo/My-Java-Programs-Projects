//Nhlapo Nkululeko Villicent

// A calculater that calculates the determinent of a 2x2 matrix.
// for full understanding watch for a visual example  on this link: www.chilimath.com/lessons/advanced-algebra/determinant-2x2-matrix/

import java.util.*;
class Matrix{
    public int  coefficientOfX; //method for creating a matrix
    public String x;
    Matrix(String x, int coefficientOfX){
        this.x = x;
        this.coefficientOfX = coefficientOfX;
    }

    
}

public class determinent {

    public static void main(String [] args){
            Scanner userInputo = new Scanner(System.in);

        System.out.println("\nWelcome User. This a dertiminent calculater for a 2x2 Matrix\n");

        boolean booli = true;

        while(true){
            String option = getInput("Do you wish to use this calculater?, Press Y for YES and N for NO:  ");

            if(option.equalsIgnoreCase("N")){
                System.out.println("Thank You, Bye");
                    break;
            }

            else if(option.equalsIgnoreCase("Y")){

                int x1, x2, x3,x4;  
                System.out.println("Enter the coefficient of x1: ");
                x1 = userInputo.nextInt();
                System.out.println("Enter the coefficient of x2: ");
                x2 = userInputo.nextInt();
                System.out.println("Enter the coefficient of x3: ");
                x3 = userInputo.nextInt();
                System.out.println("Enter the coefficient of x4: ");
                x4 = userInputo.nextInt();
            
                Matrix[] detMatrix;
                detMatrix =  new Matrix[4];
    
                detMatrix[0] = new Matrix("x_1", x1);
                detMatrix[1] = new Matrix("x_2", x2);
                detMatrix[2] = new Matrix("x_3", x3);
                detMatrix[3] = new Matrix("x_4", x4);

                for (int i = 0; i<detMatrix.length; i++){
                System.out.println("\nCoefficient of " + detMatrix[i].x + " is  " + detMatrix[i].coefficientOfX);
            
                }

                int x11, x12, x21, x22; // 11 means row 1 column 1, 12 means row 1 coulumn 2, etc
 
         
                x11 = detMatrix[0].coefficientOfX;
                x12 = detMatrix[1].coefficientOfX;
                x21 = detMatrix[2].coefficientOfX;
                x22 = detMatrix[3].coefficientOfX;

                System.out.print("\t" + x11 + "  " +  x12 + "\n\t" + x21 +  "  " + x22);
                System.out.println(" ");
                int det = (x11 * x22) - (x12 * x21) ;
                System.out.println("Therfore the Deteriminent of this matrix = " + det + "\n");
            }    
               

        }
        
    }

    static String getInput(String prompt){
        System.out.print(prompt); // method for getting the input from the user
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine(); 
    }
    
}
