//Name: Nhlapo Nkululeko Villicent - villicentnkululeko@gmail.com


public class marks_Calculater {
    public static void main(String[] args) {
        System.out.println(
            "Welcome user. This program calculates your final mark and the test mark needed to pass with  a certain final mark");
        int pracmark = 75;  //student marks
        int tutmark = 67;
        int testmark = 68;
        float pracweight = 0.4f;
        float tutweight = 0.35f;
        float testweight = 0.25f;
        int targmark = 75;
    
        //displaying marks
        System.out.println("The prac mark is " + pracmark + "% which is weighted at " + pracweight);
        System.out.println("The tut mark is " + tutmark + "% which is weighted at " + tutweight);
        System.out.println("The test mark is " + testmark + "% which is weighted at " + testweight);
        System.out.println("The target final mark is " + targmark + "%");
    
            //calculating marks
        float curfinalmark = (pracweight * pracmark) + (tutmark * tutweight) + (testmark * testweight);
        float testmarkreq = (targmark - pracweight * pracmark - tutweight * tutmark) / testweight;
    

        //printing out the students average
        System.out.println("\nWith the current marks, you're looking at a final mark of " + curfinalmark + "%");
        System.out.println(
            "In order to reach your target mark of " + (targmark) + "%, you need a test mark of " + (testmarkreq) + "%");
        System.out.println("Thanks");
    
      }
   
  
    
}