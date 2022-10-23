/*
 * Name: Nhlapo Nkululeko Villicent
 * StuNum: 4129962
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FaultIntolerant {
    public static void main(String [] args){
        String log_line;
        try {
            BufferedReader line_Reader = new BufferedReader(new FileReader(args[0]));
            log_line = line_Reader.readLine();
            
            while(log_line != null){
                
                log_line = line_Reader.readLine();
                if ((log_line.substring(22,28)).equals("ERROR ")){
                    System.err.println("\n"+ log_line + "\n");
                        break;

                } else{
                    log_line = line_Reader.readLine();
                }
                
            }
            line_Reader.close();
           
        } catch (FileNotFoundException e) {
            System.out.println("\nCannot find logfile!\nExiting...");
            System.exit(0);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
