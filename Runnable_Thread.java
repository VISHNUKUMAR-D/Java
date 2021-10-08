public class Runnable_Thread{
    public static void main(String args[]){
        Thread t1 = new Thread(new Thread_class());
        Thread t2 = new Thread(new Thread_class());
        
        t1.start();
        t2.start();
    }
}
class Thread_class implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getId()+"'s Value-"+i);
        }
    }
}