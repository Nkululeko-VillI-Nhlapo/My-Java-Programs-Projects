//Name: Nhlapo Nkululeko Villicent -villicentnkululeko@gamil.com



//This program calculates when your birth year will be, as well as the age.
import java.util.*;
public class birth_AgeCalculator {
    
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Welcome user");
            System.out.println("\nThis program determines when your birth year will be ");
            
            int birthYear;
            int age;
            int currentYear = 2022;
            System.out.println("enter your birthyear");
            birthYear = keyboard.nextInt();
            System.out.println("\nenter your age");
            age = keyboard.nextInt();
            int result = age + birthYear ;
        
            if (currentYear == result){
                System.out.println("Your birthday occurs this year in "+ result + " also, you are turning " + age);
            }
            else if (currentYear < result){
               System.out.println("Your birthday will occur in "+ result + " and you will be turning " + age);
            }
            else if (currentYear > result){
               System.out.println("Your birthday has occurred in "+ result + " and you were turning " + age);
            }

       }
    }
