class Mythread extends Thread{
   public void run(){         //overriding run method defined in Thread class.
     for(int i=0;i<10;i++)
       System.out.println("Child thread");     //thread job
   }
}
public class First{
  public static void main(String[] args){
    Mythread t = new Mythread();    //thread instatiation
    t.start();
     for(int i=0;i<10;i++)
       System.out.println("Main thread");
    }
}