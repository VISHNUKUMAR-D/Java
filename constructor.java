public class constructor{
    public static void main(String args[]){
        add object = new add(2, 3);
        System.out.println("SUM IS "+object.sum());
    }
}
class add{
    int a;
    int b;
    int c;
    public int sum(){
        return a+b+c;
    }
    add(){
        System.out.println("This line is in the Class Constructor");
        a=10;
        b=20;
        c=30;
    }
    add(int a, int b){
        this.a = a;
        this.b = b;
        c = 5;
    }
}