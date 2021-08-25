import static java.lang.System.out;
class MyThread extends Thread{}

class First{
   public static void main(String[] args){
   out.println(Thread.currentThread().getPriority());
   Thread.currentThread().setPriority(7);
   MyThread t1= new MyThread();
   out.println(t1.getPriority());
   }
}
