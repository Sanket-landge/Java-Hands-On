// Method local inner class to find sum.

class MethodLocalSum
{
   public void m1()
  {
      class InnerSum
      {
         public void sum(int x, int y)
         {
             System.out.println("The sum is "+(x+y));
         }
      }
      InnerSum i = new InnerSum();
      ;
      ;
      ;
      i.sum(20,50);
      ;
      ;
      i.sum(90,70);
  }
   public static void main(String[] args)
   {
       MethodLocalSum m = new MethodLocalSum();
       m.m1();
   }
}