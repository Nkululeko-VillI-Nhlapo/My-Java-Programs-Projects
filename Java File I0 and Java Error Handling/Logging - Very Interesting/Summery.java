/*
 * Name: Nhlapo Nkululeko Villicent
 * StuNum: 4129962
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Summery {
    public static void main(String [] args){
        String line = " ";
        int count = 0, tally = 0, sum = 0;

        try {
            BufferedReader log_reader = new BufferedReader(new FileReader(args[0]));
            while ((line = log_reader.readLine()) != null){
                String[] log_values = line.split(" ");
                if (log_values[2].equals("WARNING")){
                    count++;
                    
                } 
                else if(log_values[2].equals("NOTIFY")){
                    tally++;
                } else{
                    sum++;
                }
            }
            log_reader.close();
            System.out.println("Summery");
            System.out.println("---------------------------------");
            System.out.println("Notifications: " + tally);
            System.out.println("Warnings: " + count);
            System.out.println("Errors: " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Cannot find logfile!\nExiting...");
            System.exit(0);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
