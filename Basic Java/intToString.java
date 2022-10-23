/*
 * Nhlapo Nkululeko Villicent - villicentnkululeko@gmail.com
 */

/*Suppose that s1 and s2 are variables of type String, whose values are expected to be string 
representations of values of type int. Choose the correct code segment that will compute and print 
the integer sum of those values, or will print an error message if the values cannot successfully 
be converted into integers. (Use a try..catch statement.*/

public class intToString {
    public static void main(String[] args){
        try {
            int n1, n2;  // The values of s1 and s2 as integers.
            int sum;     // The sum of n1 and n2.
            String s1 = "3";
            String s2 = "4";
            n1 = Integer.parseInt(s1);
            n2 = Integer.parseInt(s2);
            sum = n1 + n2;   // (If an exception occurs, we don't get to this point.)
            System.out.println("The sum is " + sum);
        }
        catch ( NumberFormatException e ) {
            System.out.println("Error!  Unable to convert strings to integers.");
        }
    }
}