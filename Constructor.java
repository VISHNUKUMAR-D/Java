public class Constructor{
    public static void main(String args[]){
        Add object = new Add(2, 3);
        System.out.println("SUM IS "+object.sum());
    }
}
class Add{
    int a;
    int b;
    int c;
    public int sum(){
        return a+b+c;
    }
    Add(){
        System.out.println("This line is in the Class Constructor");
        a=10;
        b=20;
        c=30;
    }
    Add(int a, int b){
        this.a = a;
        this.b = b;
        c = 5;
    }
}