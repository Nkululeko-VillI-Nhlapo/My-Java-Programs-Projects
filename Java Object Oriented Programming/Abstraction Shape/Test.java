public class Test {
    public static void main(String[] args){
        Circle T_Circ = new Circle("Orange", 10);
       System.out.println(T_Circ.toString() + "\n") ;
       Rectangle T_Rec = new Rectangle("Blue", 13.4, 7.6);
       System.out.println(T_Rec.toString() + "\n");
       Square T_Squ = new Square("Purple", "You now know #Abstration,Hureey", 4);
       System.out.println(T_Squ.toString());
    }
}
