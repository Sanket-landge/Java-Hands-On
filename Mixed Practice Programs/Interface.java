interface Animal{
  public void sound();
  public void run();
}
  
class Dog implements Animal{
  public void sound(){
    System.out.println("Bow Bow");
 }
 public void run(){
    System.out.println("Running...");
 }
}

public class First{
  public static void main(String[] args){
    Dog d1 = new Dog();
    d1.sound();
    d1.run();
 }
}