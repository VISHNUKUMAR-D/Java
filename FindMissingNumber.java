import java.util.Scanner;
public class FindMissingNumber{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("ENTER INTEGER N : ");
    int n = scan.nextInt();
    int TotalSum = 0,TempSum=0;
    System.out.println("ENTER INTEGER N-1 NUMBER THAT IS INCLUSIVE BETWEEN 1 TO N : ");
    for(int i=1; i<n; i++){
        TotalSum+=i;
        TempSum += scan.nextInt();
    }
    TotalSum+=n;
    System.out.println("THE MISSING NUMBER IS : "+(TotalSum-TempSum));
}
}
