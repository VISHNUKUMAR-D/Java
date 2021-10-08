import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class File_{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String filename, content;
        System.out.print("Enter Filename : ");
        filename = scan.nextLine();
        try{
            File file = new File(filename);

            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            System.out.println("Enter the Content : ");
            content = scan.nextLine();
            pw.println(content);
            pw.close();
            System.out.println("File saved successfully");
            System.out.println("The content in the File Written is : ");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine())!= null){
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}