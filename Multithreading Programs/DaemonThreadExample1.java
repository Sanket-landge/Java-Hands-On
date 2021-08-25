import static java.lang.System.out;
import java.util.Scanner;
class MyThread extends Thread{
  public void run(){
  for(int i=1;i<=10;i++){
    out.println("child thread");
  }
  try{
     Thread.sleep(2000);
  }
  catch(InterruptedException e){}
 }
}
class DeamonThread2{
  public static void main(String[] args){
   MyThread t = new MyThread();
   t.setDaemon(true);
   t.start();
   out.println("End of main");
 }
}