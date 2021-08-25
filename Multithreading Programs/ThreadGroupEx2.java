import static java.lang.System.out;
import java.util.Scanner;
class ThreadGroupEx2{
    public static void main(String[] args){
       ThreadGroup g1 = new ThreadGroup("First group");
       out.println(g1.getParent().getName());   
       ThreadGroup g2 = new ThreadGroup(g1,"Second group");
       out.println(g2.getParent().getName());
   }
}