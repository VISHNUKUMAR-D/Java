import java.util.Scanner;

public class lexicographical{
    static Scanner scan = new Scanner(System.in);
    static int size;
    static String[] string;

    public static void main(String args[]){
        System.out.print("ENTER THE SIZE OF ARRAY : ");
        size = scan.nextInt();
        string = new String[size];
        System.out.println("ENTER THE STRING : ");

        getarray();
        lexi();
        
        System.out.println("THE LEXICOGRAPHICALLY ARRANGED ARRAY IS : ");
        print();
    }


    //Method to get the array strings
    public static void getarray(){
        for(int i =0; i< string.length; i++){  
            string[i] = scan.next();
        }
    }

    // Method to print the array
    public static void print(){
        for(int i=0; i<string.length; i++){
            System.out.println(string[i]);
        }
    }

    // Method to swap the strings
    public static void swap(int i , int j){
        String temp = string[i];
        string[i] = string[j];
        string[j] = temp;
    }

    //Method to arrange the strings in LEXICOGRAPHICAL order
    public static void lexi(){
        for(int i = 0; i < string.length-1; i++){
            for (int j=i+1; j<string.length; j++){
                if(string[i].charAt(0) > string[j].charAt(0)){
                    swap(i, j);
                }
                else if(string[i].charAt(0) == string[j].charAt(0)){
                    same_letter(0, i, j);
                }
                else{
                    continue;
                }
            } 
        }
    }


    // Method to perform operation when the words contain same letter
    public static void same_letter(int k, int i, int j){
        int same = 0;
        if(string[i].charAt(k) == string[j].charAt(k)){
            k++;
            if(k < string[i].length() && k < string[j].length()){
                same_letter(k, i, j);
            }
            else{
                same = 1;
                k--;
            }
        }
        else if(string[i].charAt(k) > string[j].charAt(k)){
            same = 0;
            swap(i,j);
        }
        else{
        }
        if(string[i].length() > string[j].length() && same == 1){
                swap(i, j);
        }
    }
}
