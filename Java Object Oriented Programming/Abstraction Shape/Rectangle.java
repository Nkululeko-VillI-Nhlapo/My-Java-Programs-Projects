public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width){
        super(color);
        System.out.println("The rectangle constructor has been called");
        this.length = length;
        this.width = length;
    }

    @Override
    public double area(){
        return length * width;
    }

    @Override
    public String toString(){
        return "The color of the rectangle is: " + super.getColor() + " The area of the rectangle is: " + area();
    }
}
