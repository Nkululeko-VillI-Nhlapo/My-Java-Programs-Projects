public class Greeter {
    private static String message = "You have been Sanitized";
    private int called = 0;

    public void saySanitize(){
        System.out.println(message);
        called++;
    }

    public void saySanitize(String name){
        System.out.println("Ola " + name);
        called++;
    }

    public void saySanitize(String name, int times){
        for (int i = 0; i < times; i++ ){
            System.out.println("Hello " + name);
        }
        called++;

    }

    public int getNumCalled(){
        return called;
    }

    public static void main(String[] args){
        System.out.println(message);
    }

}
