abstract public class Vehicle {
    private String name;
    protected double maxChargeCapacity;
    protected double chargeRemaining;


    Vehicle(String name, double maxChargeCapacity){
        this.name = name;
        this.maxChargeCapacity = maxChargeCapacity;;
    }

    abstract void printInfo();
    abstract double calculateTotalChargeNeeded();

    public String getName(){
        return this.name;
    }

    public double getMaxChargeCapacity(){
        return this.maxChargeCapacity;
    }

    public double getChargeRemaining(){
        return this.chargeRemaining;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMaxChargeCapacity(double maxChargeCapacity){
        this.maxChargeCapacity = maxChargeCapacity;
    }

    public void setChargeRemaining(double chargeRemaining){
        this.chargeRemaining = chargeRemaining;
    }
}
