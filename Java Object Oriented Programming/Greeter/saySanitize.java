public class saySanitize {
    public static void main(String [] args){
        Greeter sanit = new Greeter();
        sanit.saySanitize();

        sanit.saySanitize("Balulekile");
        sanit.saySanitize("Balulekile", 20);

        if (sanit.getNumCalled() < 10){
            System.out.println("You Barely Sanitize");

        }

        
    }
}
