import java.util.Scanner;

public class ReverseTheSentence{
    public static void  main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("ENTER THE SENTENCE : ");
    String sentence = scan.nextLine();
    String[] words = sentence.split(" ");
    sentence="";
    for(int i=words.length-1;i>=0;i--){
        sentence+=words[i]+" ";
    }
    System.out.println(sentence);
}
}