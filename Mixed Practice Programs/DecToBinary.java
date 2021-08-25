import java.util.Scanner;
class First
{
   public static void main(String[] args)
   {
     int decimalNum, quot, i = 1, j;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any number: ");
     decimalNum = sc.nextInt();
     int[] binaryNum = new int [100];
     quot = decimalNum;
     
     while(decimalNum != 0){
       binaryNum[i++] = decimalNum%2;
       decimalNum=decimalNum/2;
     }

     System.out.println("Binary number is : ");
     for(j=i-1;j>0;j--){
      System.out.print(binaryNum[j]);
     }
    
  }
}