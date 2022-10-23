import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;



/* 
 * Nhlapo Nkululeko Villicent - villicentnkululeko
 * The program reads data from csv file and displays it in the terminals.
 */
public class csv_reader {

    public static void main(String [] Args){
        String path = "C:/Users/27849/Downloads/SampleCSVFile_2kb.csv"; // declaring file path
        String line = " , "; // a delimeter   

        try { // to manage bugs if any
            BufferedReader br =  new BufferedReader(new FileReader(path)); //using a buffer reader to scan trough the csv
            while ((line = br.readLine()) != null){ // stop when there's no longer a line of data to read
                String[] values = line.split(","); // store values after a comma into a string
                System.out.println(values[5]); 
                
                
            }
        } catch (FileNotFoundException e) { //handling exceptions
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
  
    

