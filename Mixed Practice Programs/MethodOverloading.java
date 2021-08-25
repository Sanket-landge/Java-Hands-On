import java.util.Scanner;
class First
{
   static void sum(int x, int y){
    System.out.println(x+y);
   }
   static void sum(int x, int y, int z){
    System.out.println(x+y+z);
   }
   public static void main(String[] args){
   sum(4,5);
   sum(6,7,8);
}
}