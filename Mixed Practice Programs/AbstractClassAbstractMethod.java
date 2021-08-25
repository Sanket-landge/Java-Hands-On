abstract class Animal{
  abstract void animalSound();
  abstract void sleep();
}
  
class Dog extends Animal{
 void animalSound(){
   System.out.println("Bark");
}
  void sleep(){
  System.out.println("sleeping");
}
}

public class First{
  public static void main(String[] args){
   Dog d1= new Dog();
   d1.animalSound();
   d1.sleep();
}
}