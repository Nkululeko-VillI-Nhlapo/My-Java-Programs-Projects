public class Square extends Shape {
    String message;
    double side;
    public Square(String color, String message, double side){
        super(color);
        System.out.println("The square constructor has been called");
        this.message = message;
        this.side = side;
    }

    @Override
    public double area(){
        return Math.pow(side, 2);
    }

    @Override
    public String toString(){
        return "The shape of the square is: " + super.getColor() + " it's area is: " + area();
    }
}
