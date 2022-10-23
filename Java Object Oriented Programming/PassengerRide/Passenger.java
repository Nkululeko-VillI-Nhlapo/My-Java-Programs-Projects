import java.util.ArrayList;
import java.util.Date;

//this class represents the passengers in the ride platform
public class Passenger extends Person {
    private ArrayList <RideRecord> rideHistory;

    public Passenger(String name, String idNumber, Date dateOfBirth){
        super(name, dateOfBirth, idNumber);
        this.rideHistory = new ArrayList <RideRecord>();
    }

    public void takeRide(RideRecord rideRecord){
        this.rideHistory.add(rideRecord);
    }

    public boolean hasRideHistory(){
        return !(this.rideHistory.isEmpty());
    }

    @Override
    public int compareTo(Person p) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
