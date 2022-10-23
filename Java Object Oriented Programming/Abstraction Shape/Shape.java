abstract public class Shape {
    String color;

    //abstract methods
    public abstract double area();
    public abstract String toString();

    //abstarction class can have a constructor

    public Shape(String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }

    //concrete method - can be overridden
    public String getColor(){
        return color;
    }



}
