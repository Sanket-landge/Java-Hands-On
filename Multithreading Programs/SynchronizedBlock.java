import static java.lang.System.out;
import java.util.Scanner;
class Display{
   public void wish(String name){
    ;;;;;;;;;;;;
     synchronized(this){
     for(int i=1;i<=10;i++){
         out.print("good morning: ");
       try{
          Thread.sleep(2000);
     }catch(InterruptedException e){}
     out.println(name);
     }
   }
  }
}

class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d, String name){
        this.d = d ;
        this.name = name;
    } 
    public void run(){
     d.wish(name);
    }
}
       
class SynchronizedBlock{
   public static void main(String[] args){
     Display d = new Display();
     MyThread t1 = new MyThread(d,"Sanket");
     MyThread t2 = new MyThread(d,"Akshu");
     t1.start();
     t2.start();
  }
}