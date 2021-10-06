/*
                    FINAL KEYWORD
        1. FINAL class cannot be subclassed
        2. FINAL method cannot be overridden by the subclass
        3. FINAL variable can be initialised only once.
 */



public class Final{
    public static void main(String args[]){
        final_class object = new final_class();
        // object.number = 2;

    }
}
class final_class{
    public final int number;
    final_class(){
        number = 20;
    }
}