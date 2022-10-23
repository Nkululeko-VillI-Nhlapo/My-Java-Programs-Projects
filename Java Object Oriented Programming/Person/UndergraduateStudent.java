package Person;

public class UndergraduateStudent extends Student {
    private String degreeName;
    
    public UndergraduateStudent(){
        this("none", "none", "none");
    }

    public UndergraduateStudent(String name, String Student_number, String degreeName){
        super(name, Student_number);
        this.degreeName = degreeName;
    }

    public void sayHello(){
        System.out.println("My degree is: " + this.degreeName);
    }
}
