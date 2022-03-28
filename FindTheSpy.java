import java.util.Scanner;
public class FindTheSpy{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b,c,n;
        System.out.print("ENTER NUMBER OF ELEMENTS : ");
        n = scan.nextInt();
        System.out.println("ENTER "+n+" ELEMENTS : ");
        a= scan.nextInt();
        b= scan.nextInt();
        c= scan.nextInt();
        if(a==b){
            if(a!=c){
                System.out.println(c+" IS THE SPY");
            }
            else{
                for(int i=0; i<(n-3); i++){
                    int Number = scan.nextInt();
                    if(a!=Number){
                     System.out.println(Number+" IS THE SPY");    
                     break;
                    }
                }
            }
        }
        else if (a!=c){
            System.out.println(a+" IS THE SPY");
        }
        else{
            System.out.println(b+" IS THE SPY");
        }

    }
}