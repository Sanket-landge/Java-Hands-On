import static java.lang.System.out;
import java.util.Scanner;
import java.util.concurrent.*;
class PrintJob implements Runnable{
   String name;
   PrintJob(String name)
   {
      this.name =  name ;
   }
    public void run(){
      out.println(name+" job started by thread: "+Thread.currentThread().getName());
      try{
         Thread.sleep(5000);
      }
      catch(InterruptedException e){}
     out.println(name+" job completed by thread: "+Thread.currentThread().getName());
   }
}

class ExecutorDemo{
   public static void main(String[] args){
     PrintJob[] jobs = { new PrintJob("Iron Man"), new PrintJob("Hulk"), new PrintJob("Thor"), new PrintJob("Doctor Strange")};
     ExecutorService service = Executors.newFixedThreadPool(4);
     for(PrintJob job : jobs){
        service.submit(job);
     }
     service.shutdown();
   }
}