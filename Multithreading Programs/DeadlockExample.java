import static java.lang.System.out;
import java.util.Scanner;
class A{
  public synchronized void d1(B b){
     out.println("Thread 1 excecuting d1()" );
  try{
    Thread.sleep(5000);
  }
  catch(InterruptedException e){}
  out.println("Thread 1 trying to call B's last()");
 }
  public synchronized void last()
  {
    out.println("Inside A, this is last()");
  }
}
class B{
  public synchronized void d2(A a){
     out.println("Thread 2 excecuting d2()" );
  try{
    Thread.sleep(5000);
  }
  catch(InterruptedException e){}
  out.println("Thread 2 trying to call A's last()");
 }
  public synchronized void last()
  {
    out.println("Inside B, this is last()");
  }
}

class Deadlock extends Thread{
   A a = new A();
   B b = new B();
  public void m1(){
    this.start();
    a.d1(b);  //this line is executed by main thread.
  }
 public void run(){
    b.d2(a);
 }
  public static void main(String[] args){
   Deadlock t = new Deadlock();
   t.m1();
 }
}