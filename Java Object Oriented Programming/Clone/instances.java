

public class instances {

    public static void main(String args[]) {
        Clone clone1 = new Clone();
        Clone clone2 = new Clone();
        Clone clone3 = clone1.copy();
   

        System.out.println(clone1);
        
        System.out.println(clone1.getInfo());

        clone1.name = "Balulekile";
        clone1.updateAge(20);

        int[] arr = clone1.getScores();
        arr[0] = 100;

        clone2.name = "Nkululeko";
        clone2.updateAge(17);

        System.out.println("\n"+clone1.getInfo());
        System.out.println(clone2.getInfo());
        System.out.println(clone3.getInfo());
        System.out.println(clone1.isAdult());
        System.out.println(clone1.getScores()[0]);






    
    }
}

