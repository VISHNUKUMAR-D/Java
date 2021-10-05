public class classes{
    public static void main(String args[]){
        class_1 object = new class_1();
        object.seta(10);
        object.setb(20);
        System.out.println(object.geta() +object.getb());
    }
} 
class class_1{
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