//Accessing inner class code from the static area of outer class.

class Outer1{
   class Inner{
       public void m1(){
          System.out.println("Inner class method");
       }
   }
    public static void main(String[] args){
      Outer1 o = new Outer1();
      Outer1.Inner i = o.new Inner();
      i.m1();
      //we can also write above three lines as :  Outer1.Inner i = new Outer1().new Inner();
     //                                                               i.m1();
     //  or
     //we can also write above three lines in one line as : new Outer1().new Inner().m1();
    }
}