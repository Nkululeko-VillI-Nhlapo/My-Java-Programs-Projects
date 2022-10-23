 /*
  * Nhlapo Nkululeko Villicent - villicentnkululeko@gmail.com
  * array object of students
  */
 
 
 //practcing arrays with objects


class Student{
    public int roll_no;
     String name;
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
        
    }
   //Elements of the array are objects of the class Student 
}
public class stu_names_array {
    public static void main(String [] args) {
        Student[] arr;
        arr = new Student[5];

        arr[0] = new Student(1, "Balulekile");
        arr[1] = new Student(2, "Nkululeko");
        arr[2] = new Student(3, "Themba");
        arr[3] = new Student(4, "Thobega");
        arr[4] = new Student(5, "Villicent");

        for (int i=0; i < arr.length ; i++){
            System.out.println("Element at " + i + ": " + arr[i].roll_no +" "+ arr[i].name );
        }
    }
    

    





}
