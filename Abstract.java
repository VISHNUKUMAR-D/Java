/*
                ABSTRACT class

            1.Instances or object cannot be created for the classes declared with abstract keyword.
            2.This class can be accessed by the subclasses (inheritance)


                ABSTRACT method 

            1.The class should be abstract.
            2.No instanciation should be present.
            3.Only declaration of the method should be done.
            4.Implementation of the abstract method should be in the sub-class.
 */


 public class Abstract{
     public static void main(String args[]){
         // Area object = new Area(); Because of creating the class Area as abstract , object or instance for this class cannot be created.
         Rectangle rect = new Rectangle();
         rect.set_values(10, 20);
         System.out.println("Area OF Rectangle : "+ rect.Rectangle_Area());
     }
 }

abstract class Area{
    int height;
    int width;

    protected void set_values(int height, int width){
        this.height = height;
        this.width = width;
    }
    abstract protected double Rectangle_Area();
}

class Rectangle extends Area{
    protected double Rectangle_Area(){
        return height*width;
    }
}