package Person;

public class University {
    public static void main(String[] args){
        Person[] people = new Person[3];

        people[0] = new Person("Teach");
        people[1] = new Student("Nkululeko", "4129962");
        people[2] = new UndergraduateStudent("Undergrad", "099", "Computer Science");

    for(int i = 0 ; i < people.length; i++){{
        people[i].sayHello();
    }}

    }
}
