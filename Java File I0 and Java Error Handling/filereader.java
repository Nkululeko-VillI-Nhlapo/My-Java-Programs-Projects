/*
 * Nhlapo Nkululeko - villicentnkululeko@gmail.com
 * filereader program, but reads in text that has integers and does some calculations on them
 * 1. store the file integers into an array, displays them in order then  prints out them minimum and the maximum
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class filereader {

    static int[] storageArr = new int[10];
    public static void sortArray(int[] arr)
    {
      Arrays.sort(arr);
    }
    public static void main(String args[]) throws IOException {
        BufferedReader reader =new BufferedReader(new FileReader(args[0]));

        String Int_line;
        int arrIndex = 0, sumOfArr = 0;


        while ((Int_line = reader.readLine()) != null) {
            try {
                int In_Value = Integer.parseInt(Int_line);
                storageArr[arrIndex++] = In_Value;
            }catch(NumberFormatException ex){
                System.err.println("Invalid input.  '" + Int_line + "' is not a valid integer. Unable to continue");
                System.exit(0);
            }
        }

        //Printing the values in the storageArr
        System.out.println("Printing the values in the storageArr");
        for (int i = 0; i < storageArr.length; i++){
            System.out.print(storageArr[i]+" ");
        }
        System.out.println();

        //Calculated and Printing the sum of the values in the storageArr
        for (int i = 0; i < storageArr.length; i++){
            sumOfArr+=storageArr[i];
        }

        System.out.println("The sum of all the values in storageArr is :"+sumOfArr );

        System.out.println();

        //Printing the MIN/MAX values in the storageArr
        System.out.println("Maximum value in storageArr is "+Arrays.stream(storageArr).max());
        System.out.println("Minimum value in storageArr is "+ Arrays.stream(storageArr).min());

        System.out.println();
        //Sorting the values in storageArr
        sortArray(storageArr);
        System.out.println("Printing the sorted storageArr");
        for (int i = 0; i < storageArr.length; i++){
            System.out.print(storageArr[i]+" ");
        }
    }
}
