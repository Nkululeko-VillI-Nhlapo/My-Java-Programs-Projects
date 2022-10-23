package Person;

public class Person {
    private String name;

    public Person(){
        this.name = "no name yet";

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name =  name;

    }

    public void sayHello(){
        System.out.println("Hola,Como Estas, my name is" + this.name);
    }




    public static void main(String [] args){
        
        Student me = new Student();
        me.setName("Nkululeko Villicent");
        me.setStudent_number("419962");

        me.sayHello();
    }

}    

