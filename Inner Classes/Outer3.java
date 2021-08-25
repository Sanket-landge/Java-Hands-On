//Accessing Inner class code outside the outer class.

class Outerclass{
   class Inner{
       public void m1(){
          System.out.println("Inner class method");
       }
   }
}
class Outer3{
    public static void main(String[] args){
      Outerclass o = new Outerclass();
      Outerclass.Inner i = o.new Inner();
      i.m1();
    }
}