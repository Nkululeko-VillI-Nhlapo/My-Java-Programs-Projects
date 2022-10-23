//Nkululeko Nhlapo Villicent

//Enum Switch
//the program loops trough the switch and prints out all the days
public class Days_switch {
    public enum Day  {Sun, Mon, Tue, Wed, Thur, Fri, Sat}; //creating an enum

    public static void main(String [] args) {

         Day[] DayNow = Day.values(); //creating a list and assigning enum values to it

         for( Day Now : DayNow){
            switch (Now){       //switch statements
                case Sun:
                    System.out.println("Sunday");
                        break;
                case Mon:
                    System.out.println("Monday");
                        break;
                case Tue:
                    System.out.println("Tuesday");
                        break;
                case Wed:
                    System.out.println("Wednesday");
                        break;
                case Thur:
                    System.out.println("Thursday");
                        break;
                case Fri:
                    System.out.println("Friday");
                        break;
                case Sat:
                    System.out.println("Saturday");
                        break;
            }
         }
        
    }
}
