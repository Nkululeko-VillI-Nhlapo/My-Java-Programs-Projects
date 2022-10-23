 import java.util.Date;
 public class AssignmentDemo {
   public static void main(String[] args) {
     Driver goliath = new Driver("John Goliath", "673622367232",
                                 new Date(-178934400000L), "CAA202210");
     Passenger david =
         new Passenger("Nkululeko Nhlapo", "9906014269088", new Date(928195200000L));
     System.out.printf("Name: %s\nRSA ID:%s\nDOB:%s\nHas ride history?: %b\n",
                       david.getName(), david.getIdNumber(),
                       david.getDateOfBirth(), david.hasRideHistory());
     goliath.giveRide(RideRecord.RideType.Quantum, 56.00, david);
     System.out.println("----------------------------");
     System.out.printf("Name: %s\nRSA ID:%s\nDOB:%s\nHas ride history?: %b\n",
                       david.getName(), david.getIdNumber(),
                       david.getDateOfBirth(), david.hasRideHistory());

    
   }
 }
