public class bike implements Vehicle {
    int gear;
    int speed;

    @Override
    public void changeGear(int newGear){
        this.gear = newGear;
    }

    @Override
    public void speedUp(int increament){
        this.speed = speed + increament;
    }

    @Override
    public void applyBrakes(int decreament){
        this.speed = speed - decreament;
    }

    public void printStates(){
        System.out.println("Speed: " + this.speed + " gear: " + this.gear );
    }
}
