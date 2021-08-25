import java.util.Scanner;
class First
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your age: ");
     int age = sc.nextInt();
     String vote = (age>18) ? "you can vote" : "You cant vote";
     System.out.println(vote);
  }
}