import static java.lang.System.out;
class Test{
    public static void main(String[] args){
      out.println(m1());
    }
    public static int m1(){
      try{
      out.println("try executed");
      System.exit(0);
      }
      catch(Exception e){
       e.printStackTrace();
       return 888;
      }
      finally{
       out.println("finally executed");
       return 999;
      }
    }
}
