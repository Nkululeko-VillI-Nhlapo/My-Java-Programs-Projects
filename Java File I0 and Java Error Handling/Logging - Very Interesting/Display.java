
/*
 * Name: Nhlapo Nkululeko Villicent
 * StuNum: 4129962
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display{
    public static void main(String [] args){

        ArrayList<String> log_Array = new ArrayList<>();
        Scanner log_Input = new Scanner(System.in);
        String line;
        
        System.out.println("Welcome User, My Name is Loggi\nAnd am here to show You where issues might be.");
        System.out.println("\nSince the list of issues is long, Am going to allow you to tell me how many issues should i list");
        System.out.println("Say you enter 0 and 10, then i'll list issues between 0 and 10, Enter numbers below 1000 only");


        try{
            File log_File = new File(args[0]);
            Scanner logScanner = new Scanner(log_File);

            while (logScanner.hasNextLine()){
                line = logScanner.nextLine();
                log_Array.add(line);
                
            }
            logScanner.close();

            String[] log_Array_2 = log_Array.toArray(new String[0]);

            
            System.out.println("\nEnter the first number");
            int num_1, num_2;
            num_1 = log_Input.nextInt();
            System.out.println("Enter the Second number");
            num_2 = log_Input.nextInt();

            int smallnum, bignum;
            if(num_1 > num_2){
                smallnum = num_2;
                bignum = num_1 + 1;
            } else{
                smallnum = num_1;
                bignum = num_2 + 1;
            }
            

            for (int i = smallnum; i < bignum; i++){
                System.out.println("\n" + log_Array_2[i]);
            }
            
        } catch (FileNotFoundException e){
            System.out.println("\nCannot find logfile!\nExiting...");
            System.exit(0);
            
        }
    }
}