public class Recursion{
    public static void main(String args[]){
        Factorial object = new Factorial();
        System.out.println("Factorial of 4 is : " + object.factorial_cal(4));
    }
}
class Factorial{
    int number;
    int factorial = 1;
    protected int factorial_cal(int number){
        if(number != 1){
            factorial = number*factorial_cal(number-1);
        }
        return factorial;
    }
}