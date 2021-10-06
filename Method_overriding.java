/*
METHOD OVERRIDING
When a method in sub class is declared same as in  parent class then it is called overriding of a method.
The declared method should be same as in all aspects like datatype, name, etc.

Difference between Method Overloading and Method Overriding
---------------------------------------------------------------
|      METHOD OVERLOADING        |      METHOD OVERRIDING      |
---------------------------------------------------------------
| Same method name but number of | Same method name with same  |
|arguements and their datatypes  |number of arguements with    |
|and return type may vary.       |same datatype and return type|
---------------------------------------------------------------
| Declared in same class         | Declared between parent     |
|                                |class and sub class          |
---------------------------------------------------------------
|Ex of compile time polymorphism | Ex of run time polymorphism |
---------------------------------------------------------------

*/



public class Method_overriding{
    protected void print(){
        System.out.println("This statement will not be printed.");
    }
    public static void main(String args[]){
        Method_overriding object = new Subclass_of_Method_overriding();
        object.print();
    }
}
class Subclass_of_Method_overriding extends Method_overriding{
    protected void print(){
        System.out.println("This is an example of Method_overriding.");
    }
}