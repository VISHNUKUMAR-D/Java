/*
This is a simple STRING program in which operations like 
1.LENGTH of STRING
2.INDEX of STRING
3.CHARACTER at the particular INDEX
4.UPPERCASE and LOWERCASE conversion 
is done 
*/
public class string{
    public static void main (String args[]){
        String s = "String Example";
        int i = s.length();
        for(int j=0; j<i; j++ ){
        System.out.println(s.charAt(j) +"-"+ s.indexOf(s.charAt(j)));
        }
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}
