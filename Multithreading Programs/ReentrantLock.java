import java.util.concurrent.locks.*;
import static java.lang.System.out;
import java.util.Scanner;
class Display{
   ReentrantLock l = new ReentrantLock();
   public void wish(String name){
    l.lock();
    for(int i = 1;i<=10;i++){
      out.print("Good morning : ");
      try{
        Thread.sleep(2000);
      }
       catch(InterruptedException e){}
      out.println(name);
    }
    l.unlock();
   }
}

class MyThread extends Thread{
   Display d;
   String name;
   MyThread(Display d, String name){
      this.d = d ;
      this.name = name ;
   }
   public void run(){
     d.wish(name);
   }
}

class ReenterantLock{
   public static void main(String[] args){
       Display d = new Display();
       MyThread t1 = new MyThread(d,"Iron Man");
       MyThread t2 = new MyThread(d,"Super Man");
       t1.start();
       t2.start();
   }
}