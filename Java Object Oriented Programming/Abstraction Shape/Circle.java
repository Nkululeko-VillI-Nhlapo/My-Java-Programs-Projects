public class Circle extends Shape {

    double radius;

    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle Constructor called");
        this.radius  = radius;


    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return "Circle color is: " + super.getColor() + " The area is: " + area();
    }
    
}
