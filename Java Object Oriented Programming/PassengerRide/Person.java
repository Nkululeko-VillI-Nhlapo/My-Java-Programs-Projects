import java.util.Date;
import java.lang.Comparable; //to compare objects

/*
 * This is an abstact representation of South African Citezen.
 */
abstract class Person{

    private String name; //name of the person
    private Date dateOfBirth; //his or her Date of Birth
    private String idNumber;  //RSA ID Number

    Person( String name, Date dateOfBirth, String idNumber){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idNumber = idNumber;
    }

    public abstract int compareTo(Person p); //abstract compareTo method, to compare to Another Person "p" object

    public String getName(){
        return this.name;
    }

    public String getIdNumber(){
        return this.idNumber;
    }

    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }




}