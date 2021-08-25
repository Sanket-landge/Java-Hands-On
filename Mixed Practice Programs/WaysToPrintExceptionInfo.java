import static java.lang.System.out;
class Test{
    public static void main(String[] args){
      out.println("statement 1");
      try{
      out.println(10/0);
      }
      catch(ArithmeticException e){
      e.printStackTrace();
      out.println(e);
      out.println(e.getMessage());
      }
      out.println("statement 3");
    }
}
