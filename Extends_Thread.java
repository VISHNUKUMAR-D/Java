public class Extends_Thread {
    public static void main(String args[]){
        Thread_ Thread_1 = new Thread_();
        Thread_1.start();
        Thread_ Thread_2 = new Thread_();
        Thread_2.start();
    }
}
class Thread_ extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getId()+"'s Value-"+i);
        }
    }
}