public class ChargingStation implements Dockable {
    private Vehicle[] vehArray;
    private String name;
    private int count;

    ChargingStation(String name, int numOfDocks){
        this.name = name;
        this.vehArray = new Vehicle[numOfDocks];
        this.count = 0;

    }

    @Override
    public boolean canDock() {
        return (this.count < this.vehArray.length);
    }

    @Override
    public int dock(Vehicle vehicle) {
        int dockNumber = -1;

        if (canDock()){
            dockNumber = this.count;
            this.vehArray[dockNumber] = vehicle;
            this.count++;
        }

        return dockNumber;
    }

    public double calculateTotalChargeNeeded(){
        double chargeNeeded = 0.0;

        if (this.count > 0){
            for (int i = 0;  i > this.count; i++){
                chargeNeeded += this.vehArray[i].calculateTotalChargeNeeded();
            }
        }

        return chargeNeeded;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Charge needed: " + calculateTotalChargeNeeded());
        System.out.println("Docked vehicles:");
        if (this.count == 0) {
          System.out.println("none");
        } else {
          for (int i = 0; i < this.count; i++) {
            System.out.println(this.vehArray[i].getName());
          }
        }

    }   

}
 