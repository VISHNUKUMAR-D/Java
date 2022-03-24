import java.util.*;
public class FindMissingNumber{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("ENTER INTEGER N : ");
    int n = scan.nextInt();
    System.out.println("ENTER INTEGER N-1 NUMBER THAT IS INCLUSIVE BETWEEN 1 TO N : ");
    ArrayList<Integer> list =  new ArrayList<Integer>();
    for(int i=1; i <= n; i++){
        list.add(i);
    }
    System.out.println(list);
    for(int i=1; i<n; i++){
        list.remove(new Integer(scan.nextInt()));
    }
    System.out.println(list);
}
}