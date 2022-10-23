import java.lang.Math.*;

public class BasicVehicle{
    private double latitude;
    private double longitude;
    private double altitude;
    private String registration;
    private double distance;

    

    public BasicVehicle(){
        latitude = 0.0;
        longitude = 0.0;
        altitude = 0.0;
        registration = "unknown";
    }

    public BasicVehicle(String regii,double lati, double longi, double alti ){
        
        this.latitude = lati;

        this.longitude = longi;
        
        this.altitude = alti;
        this.registration = regii;
    }

    public void setLatitude(double latitu){
        this.latitude = latitu;
    }

    public void setLongitude(double longitu){
        this.longitude = longitu;
        
    }


    public void setAltitude(double altitu){
        this.altitude = altitu;
    }

    public void setRegistration(String regiis){
        this.registration = regiis;
    } //this.name = N;

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public double getAltitude(){
        return altitude;
    }

    public String getRegistration(){
        return registration;
    }

    public void printInfo(){

        System.out.println("Registarion: " + getRegistration());
        System.out.println("Current Position: ");
        System.out.println("Alt: " + getAltitude());
        System.out.println("Lat: " + getLatitude());
        System.out.println("Long: " + getLongitude());
        

    }


    public double distanceTo(BasicVehicle vehicleC0S) {
        distance = Math.sqrt(Math.pow(vehicleC0S.altitude - altitude, 2) + Math.pow(vehicleC0S.longitude - longitude, 2) + Math.pow(vehicleC0S.latitude - latitude, 2));
        return distance;
    }

    
    

    
}

    

