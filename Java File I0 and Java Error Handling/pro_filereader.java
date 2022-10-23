import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.IIOException;

public class pro_filereader {
    static int[] storage = new int[23];
    public static void main(String [] args){
        
       int[] storage;

       try {
         Scanner reader = new Scanner(new FileReader(args[0]));

            String line = " ";
            int arrIndex =  0;
            
            while (reader.hasNextLine()) {
                int value = Integer.parseInt(line);
                storage = new int[23];
                storage[arrIndex++] = value;

                System.out.println("Printing all the values in the Array");
                for (int i = 0; i < storage.length ; i++){
                System.out.println(storage[i] + " ");
       }

            }
       } catch (FileNotFoundException e) {
            System.out.println("iYPH");
       } catch (IOException e){
         System.out.println("asuihiuash");

       }

       

    }
    
}



