//A class to implement the In1 interface

public class Testclass implements In1 {

    //implementing In1 capabilities
    @Override
    public void display(){
        System.out.println("We have implemented the Interface method");
    }
    
    public static void main(String [] args){
        Testclass T = new Testclass();
        T.display();
        
        System.out.println(a);
    }
}
