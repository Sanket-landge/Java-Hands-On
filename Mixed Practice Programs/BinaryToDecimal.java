import java.util.Scanner;
class First
{
   public static void main(String[] args)
   {
     int binaryNum,rem,i=0,decimalNum=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter binary number:");
     binaryNum = sc.nextInt();

     while(true){
     if(binaryNum == 0){
      break;
     }else{
       rem=binaryNum%10;
       decimalNum += rem*Math.pow(2,i);
       binaryNum=binaryNum/10;
       i++;
     }
    }
    System.out.println(decimalNum);
  }
}