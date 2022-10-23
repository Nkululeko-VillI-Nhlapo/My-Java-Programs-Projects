import java.util.Date;

public class RideRecord {
    //Defines a single ride taken with this riding platform
    //it has the date, type of ride, total fee and the driver

    private RideType type;
    private Date date;
    private Driver driver;
    private double fee;
    
    //different types of rides available
    public enum RideType{
        Iveco, // the largest, 22 seater

        Quantum,    //15 seater

        kwid, // 4 seat, cheap and much faster
    }
    

    public RideRecord(RideType type, double fee, Driver driver){
        this.date = new Date();
        this.fee = fee;
        this.driver = driver;
        this.type = type;
    }

}

    
    
