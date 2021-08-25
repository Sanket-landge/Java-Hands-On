import java.util.Scanner;
class First
{
   public static void main(String[] args){
    int total=0;
    double avg;
    Scanner sc = new Scanner(System.in);
    int[] marks = new int[5];
    System.out.println("Enter marks of five subjects: ");
    for(int i=0;i<5;i++){
     marks[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
      total=total+marks[i];
  }
    System.out.println(total);
    avg=total/5;
    System.out.println("Percentage: "+avg);
}
}