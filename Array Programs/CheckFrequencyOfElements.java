//program to count the frequency of elements in an Array.

import java.util.Scanner;
class First{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int[] a = new int[10];
  int[] fr= new int[a.length];
  int visited = -1;
  System.out.println("Enter 10 values to check frequency of each no: ");
  for(int i = 0;i<a.length;i++)
	a[i] = sc.nextInt();
  
  for(int i = 0;i<a.length;i++){
     int count = 1;
     for(int j = i+1; j<a.length;j++){
      if (a[i]==a[j]){
         count++;
         fr[j]=visited;
      }
     if(fr[i]!=visited)
	fr[i]=count;
  }
  }
  System.out.println("--------------------------------------");
  System.out.println("       Element      |        Frequency");
  for(int i = 0;i<fr.length;i++){
       if(fr[i]!=visited)
	System.out.println("          "+a[i]+"           "+fr[i]);
  }
}
}