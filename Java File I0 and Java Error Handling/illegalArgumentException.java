public class illegalArgumentException {
    int m;
   /**
 * @param marks
 */
public void setMarks(int marks){
        if( marks < 0 || marks > 100)
            throw new IllegalArgumentException(Integer.toString(marks));
        else
            m  = marks;
            

        
    }

    public static void main(String [] args) {
        illegalArgumentException s1 =  new illegalArgumentException();
        s1.setMarks(190);
        System.out.println(s1.m);
        illegalArgumentException s2 = new illegalArgumentException();
        s2.setMarks(4);
        System.out.println(s2.m);
        
    }
}
