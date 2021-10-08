/*
            Join
            join() method which allows one thread to wait until another thread completes its execution. 
            If t is a Thread object whose thread is currently executing, then t.join() will make sure that t is terminated before the next instruction is executed by the program.
            If there are multiple threads calling the join() methods that means overloading on join allows the programmer to specify a waiting period. 
            However, as with sleep, join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify.
            There are three overloaded join functions.

            Synchronized
            A synchronized block in Java is synchronized on some object. 
            All synchronized blocks synchronized on the same object can only have one thread executing inside them at a time. 
            All other threads attempting to enter the synchronized block are blocked until the thread inside the synchronized block exits the block.
 */


public class Join_Sync_Thread{
    public static int count=0;
    public static void main(String args[]){
        Thread t1 = new Thread(new Runnable(){
            public synchronized void run(){
            for(int i =0; i< 10000; i++){
                count++;
            }
        }});
        Thread t2 = new Thread(new Runnable(){
            public synchronized void run(){
            for(int i =0; i< 10000; i++){
                count++;
            }
        }});

        

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println(count);
    }
}