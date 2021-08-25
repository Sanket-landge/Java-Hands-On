//Accessing variable from Method local inner classes

class MethodLocalvariableAccess{
   int x = 10;
   static int y = 20;
   public void m1(){
      class Inner{
         public void m2(){
             System.out.println(x);  // if we declare m1() as static then we will get a C.E. at this line saying non-static   
             System.out.println(y);  //  variable x cannot be referenced from a static context.
         }
      }
   Inner i = new Inner();
   i.m2();
  }
   public static void main(String[] args){
       MethodLocalvariableAccess m = new MethodLocalvariableAccess();
       m.m1();
   }
}