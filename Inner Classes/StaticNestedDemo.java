//static nested class

class StaticNestedDemo{
   static class Nested{
        public void m1(){
             System.out.println("Static nested class ");
        }
   }
 public static void main(String[] args){
      Nested n = new Nested();
      n.m1();
 }
}