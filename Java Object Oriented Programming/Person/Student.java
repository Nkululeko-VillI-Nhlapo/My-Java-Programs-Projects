package Person;

public class Student extends Person {
    private String Student_number;
    public Student(){
        super();
        Student_number = "none";

        System.out.println(this.getName());
    }

    public Student(String name, String Student_number){
        super(name);
        this.Student_number = Student_number;
    }

    public String getStudent_number(){
        return this.Student_number;
    }

    public void setStudent_number(String Student_number){
        this.Student_number = Student_number;
    }

    @Override
    public void sayHello(){
        super.sayHello();
        System.out.println("My Student Number: " + this.Student_number);
    }

    
}
