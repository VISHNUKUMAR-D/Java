public class method_overloading{
    public static void main(String args[]){
        method_overloading obj = new method_overloading();
        System.out.println(obj.add());
        System.out.println(add(20));
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(5.5, 8.2));
        System.out.println(add("HELLO", "WORLD"));
    }
    public int add(){
        return 10;
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a){
        return a;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static String add(String a, String b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    
}