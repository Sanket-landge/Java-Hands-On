import java.util.Scanner;
class First
{
   static void sum(int ... a){
    int result=0;

    for(int ele = 0; ele<a.length;ele++){
      result+=a[ele];
    }
   System.out.println(result);
  }
   public static void main(String[] args){
   sum(4,5);
   sum(6,7,8);
   sum();
   sum(12,45,67,89);
}
}