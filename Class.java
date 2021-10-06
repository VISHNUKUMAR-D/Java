public class Class{
    public static void main(String args[]){
        Class_1 object = new Class_1();
        object.seta(10);
        object.setb(20);
        System.out.println(object.geta() +object.getb());
    }
} 
class Class_1{
    int a;
    int b;
    public void seta(int a){
        this.a = a;
    }
    public void setb(int b){
        this.b = b;
    }
    public int geta(){
        return a;
    }
    public int getb(){
        return b;
    }
}