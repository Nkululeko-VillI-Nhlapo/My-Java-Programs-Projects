public class Vehicle_entryPoint {
    public static void main(String [] args){
        //creating an instance of a bicycle

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(4);
        bicycle.speedUp(70);
        bicycle.applyBrakes(30);

        System.out.println("Bicycle Present State");
        bicycle.printStates();

        bike Bike = new bike();
        Bike.changeGear(6);
        Bike.speedUp(25);
        Bike.applyBrakes(3);
        System.out.println("\n" + "Bike Present States");
        Bike.printStates();
    }
}
