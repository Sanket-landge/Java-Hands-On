//Accessing local variable from the same method in which we have declared Method local inner classes 

class MethodLocalLocalVariableAccess{

   public void m1(){
      int x = 10;              // if we declare this variable as final then code runs succesfully.
      class Inner{
         public void m2(){
             System.out.println(x);    //here we will get an error saying : local variable x is accessed from within InnerClass
         }                                        //needs to declared final.
      }
   Inner i = new Inner();
   i.m2();
  }
   public static void main(String[] args){
       MethodLocalLocalVariableAccess m = new MethodLocalLocalVariableAccess();
       m.m1();
   }
}