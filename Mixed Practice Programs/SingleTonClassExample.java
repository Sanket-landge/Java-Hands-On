import static java.lang.System.out;
class Test{
   private static Test t = new Test();
   private Test(){


  }
  public static Test getTest(){
   return t;
 }
}

class Demo{
   public static void main(String[] args){
      Test t1 = Test.getTest();
      Test t2 = Test.getTest();
   }
}