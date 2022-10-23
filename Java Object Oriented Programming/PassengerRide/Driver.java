import java.util.Date;

// for the driver using the platform

public class Driver extends Person {
    
    private String lisenceCode;

    public Driver(String name, String idNumber, Date dateOfBirth, String lisenceCode){
        super(name, dateOfBirth, idNumber);

        this.lisenceCode = lisenceCode;
    }

    //method for giving  a ride to a passenger object
    //The type, and fee are used to create a new RideRecord object that is passed to the Passenger argument.

    public void giveRide(RideRecord.RideType type, double fee, Passenger passenger){
        RideRecord record = new RideRecord(type, fee, this );
    }

    @Override
    public int compareTo(Person p) {
        // TODO Auto-generated method stub
        return 0;
    }



}
