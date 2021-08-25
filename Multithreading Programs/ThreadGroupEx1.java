import static java.lang.System.out;
import java.util.Scanner;
class ThreadGroupEx1{
    public static void main(String[] args){
       out.println(Thread.currentThread().getThreadGroup().getName());
       out.println(Thread.currentThread().getThreadGroup().getParent().getName());
   }
}