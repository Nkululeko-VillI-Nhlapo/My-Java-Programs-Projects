/*
 * Nhlapo Nkululeko Villicent - villicentnkululeko@gmail.com
 * displays out an array
 */

public class Arraypract2 {
    public static void main(String [] args) {
        int[] arri = new int[5];

        arri[0] = 15;
        arri[1] = 25;
        arri[2] = 35;
        arri[3] = 45;
        arri[4] = 55;

        arri[0] = 10;
        
        for (int i = 0; i < 4; i++){
            System.out.println("Element of index " + i + " is " + arri[i]);
        }
        }
}
