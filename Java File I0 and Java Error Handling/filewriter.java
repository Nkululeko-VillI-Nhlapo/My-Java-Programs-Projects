import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String [] args){
        File new_File = new File("newFile.txt");
        String data = "1 2 3 4 5 6 7 8 9 10";

        try{
            FileWriter writer = new FileWriter(new_File);

            writer.write(data);

            writer.close();
        } catch (IOException e){
            System.out.println("jerrr");
        }

        
    }
}
