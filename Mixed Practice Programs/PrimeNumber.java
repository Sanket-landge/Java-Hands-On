import java.util.Scanner;
class First
{
   public static void main(String[] args)
   {
     int num, flag=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any number: ");
     num = sc.nextInt();
     for(int i=2;i<=num/2;i++)
     {
      if(num % i == 0)
     {
         flag++;
         break;
      }
    }
      if(flag==1)
     {
       System.out.println(num+" is not a prime number");    
     }
      else
      {
       System.out.println(num+" is a prime number");
      }
   }
}