import static java.lang.System.out;
import java.util.Scanner;
class Display{
   public synchronized void wish(String name){
     for(int i=1;i<=10;i++){
         out.print("good morning: ");
       try{
          Thread.sleep(2000);
     }catch(InterruptedException e){}
     out.println(name);
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
       
class SynchronizedDemo3{
   public static void main(String[] args){
     Display d1 = new Display();
     Display d2= new Display();
     MyThread t1 = new MyThread(d1,"Sanket");
     MyThread t2 = new MyThread(d2,"Akshu");
     t1.start();
     t2.start();
  }
}