/*
                EXCEPTION HANDLING
                An Exception is an event that is occured during the execution of the program 
                that affects the normal flow of that program


                TRY 
                Checks for the Exception.
                If any Exception occurs it throws the Exception to the Caught block.
                Or else the code will be Executed.

                CATCH
                Catches the Exception thrown by the Try block.

                FINALLY
                This Block will always be executed.
 */

 public class Exception_Handling{
     public static void main(String args[]){
         int[] array = new int[5];
         try{
             array[6]=10;
             System.out.println("This line will not printed.");
             int a = 100/0;
             System.out.println("This line will not printed.");
         }
         catch(ArithmeticException e){
             System.out.println(e);
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println(e);
         }
         catch(Exception e){   //This "Exception" is itself enough to catch the anytype of exception rather than defining the type of Exception.
             System.out.println(e);
         }
         finally{
             System.out.println("This is an example of EXCEPTION_HANDLING");
         }
     }
 }