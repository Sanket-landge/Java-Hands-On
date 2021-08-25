import static java.lang.System.out;
import java.util.Scanner;
class ThreadB extends Thread{
    int total = 0;
    public void run(){
       synchronized(this){
         out.println("child thread performing updation");
         for(int i=1;i<=100;i++){
             total+=i;
         }
         out.println("Child thread giving notification");
         this.notify();
        }
    }
}

class ThreadA{
   public static void main(String[] args)throws InterruptedException{
    ThreadB b = new ThreadB();
     b.start();
     synchronized(b){
         out.println("main thread calling wait()");
         b.wait();
         out.println("main thread got notification");
         out.println("total is "+b.total);
     }
  }
}
