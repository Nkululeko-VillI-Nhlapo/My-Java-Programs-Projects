public class TestVehicle extends Vehicle {
    public TestVehicle(String name, double maxChargeCapacity){
        super(name, maxChargeCapacity);
    }

    @Override
    double calculateTotalChargeNeeded() {
        return (this.maxChargeCapacity - this.chargeRemaining);
    }

    @Override
    void printInfo() {
        System.out.println("Name" + this.getName());
        double chargePercentage = (this.chargeRemaining / this.maxChargeCapacity) * 100.0d;
        System.out.println(String.format("Charge: %.1f%%", chargePercentage));
        
    } 

    

    
}
