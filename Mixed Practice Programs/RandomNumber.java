import java.util.Scanner;
class First
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your age: ");
      int age = sc.nextInt();
      age>18 ? System.out.println("You can vote") : System.out.println("You cant vote"); 
   }
}