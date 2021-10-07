/*
        INTERFACE
        1.Syntax  :  acess_modifier interface<keyword> classname [no need to use "class" keyword].
        2.All the members of Interface class are ABSTRACT by nature.
        3."implements" is the keyword for inheriting the features from an Interface. 
        4."extends" is the keyword that is used to inherit a feature to the Interface.
        5.Variables cannot be accessed only Methods accessable.

         --------------------------------------
        | Super_Class | Sub_Class |   KeyWord  | 
         --------------------------------------
        | Interface --> Interface | implements |
         --------------------------------------
        | Interfce  --> Class     |   extends  |
         --------------------------------------
        | Class     --> Class     |   extends  |
         --------------------------------------

*/

public class Interface{
    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        //rect.set_values(10, 20);
        System.out.println("RECTANGLE AREA : "+ rect.Rectangle_area());
    }
}

interface Area{
    int height=10;
    int width=20;
    int Rectangle_area();
}
class Rectangle implements Area{
    public int Rectangle_area(){
        return height*width;
    }
}