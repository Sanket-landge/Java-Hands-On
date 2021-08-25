import static java.lang.System.out;
import java.util.Scanner;
class ThreadGroupEx3{
    public static void main(String[] args){
       ThreadGroup g1 = new ThreadGroup("First group");
       Thread t1 = new Thread(g1,"First thread");
       Thread t2 = new Thread(g1,"second thread");
       g1.setMaxPriority(3);
       Thread t3 = new Thread(g1,"third thread");
       out.println(g1.getMaxPriority());
       out.println(t1.getPriority());  //5
       out.println(t2.getPriority());  //5
      out.println(t3.getPriority());   //3
   }
}