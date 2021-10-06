public class Polymorphism{
    protected void print(){
        System.out.println("This statement will not be printed.");
    }
    public static void main(String args[]){
        Polymorphism object = new Subclass_of_Polymorphism();
        object.print();
    }
}
class Subclass_of_Polymorphism extends Polymorphism{
    protected void print(){
        System.out.println("This is an example of Polymorphism.");
    }
}