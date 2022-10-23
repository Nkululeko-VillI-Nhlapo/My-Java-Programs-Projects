//Nhlapo Nkululeko Villicent
// - A program that calculates the sum of values in the array, then calculates the average number of the array

public class sum_Arr {

    public static void main(String [] args){
        
        
        
        

           int arrow[] = {1,2,3,4,5,65}; //declared an array.
           int sum = 0;
           double average;
        for (int i : arrow){ //foe each loop, to access values of the array
            sum += i; //adding at the same time assigning values of the array to sum
        
        }
        System.out.println("The sum is: " +  sum);
        average =  sum/arrow.length; //calculating the average
        System.out.println(average);
        

    }



}
