 import java.util.*;
 
 class Card{
    String bankName, holderName;

    int accNum, securityCode;
    long cvvNum; 
}

public class classPractice {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please fill in your bank details below");
        Card customer =  new Card();
        System.out.println("Enter your bank name");
        customer.bankName = userInput.nextLine();
        System.out.println("Enter your account name ");
        customer.holderName = userInput.nextLine();
        System.out.println("Enter your account number");
        customer.accNum = userInput.nextInt();
        System.out.println("Enter your CVV number (16 digits)");
        customer.cvvNum = userInput.nextLong();
        System.out.println("Enter your Pin");
        customer.securityCode = userInput.nextInt();

        System.out.println(customer.bankName + "\n" + customer.holderName +  "\n" +  customer.accNum +  "\n" +  customer.cvvNum +  "\n" +  customer.securityCode);


        

    }
    
}
