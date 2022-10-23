public class DeliveryVehicle extends BasicVehicle {
    private String[] cargolist;
    private int numItems;

    public DeliveryVehicle(String registro, int maxCapacity ){
        super(registro, 0.0, 0.0, 0.0);

        this.cargolist = new String[maxCapacity];
        this.numItems = 0;
    }

    public boolean isFull(){
        return numItems >= cargolist.length;
    }

    public boolean isEmpty(){
        return numItems == 0;
    }

    public void loadCargo(String description){

        if (!isFull()){
            cargolist[numItems] = description;
            numItems++;
        }

    }

    @Override
    public void printInfo(){
        System.out.println("Cargo Drone: " + getRegistration());
        System.out.println("Max capacity: " + cargolist.length);

        if (isEmpty()){
            System.out.println("No Cargo Yet");
        }
        else{
            for (int i=0; i < numItems; i++){
                System.out.println(cargolist[i]);
            }
        }


    }

}
