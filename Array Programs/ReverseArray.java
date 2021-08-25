//Program to reverse Array.

import java.util.Scanner;
class ReverseArray{
  static void rev(int[] r){
   int temp;
   for(int j=0;j<r.length/2;j++){
      temp = r[j];
      r[j] = r[r.length-j-1];
      r[r.length-j-1] = temp;
   }
   for(int i =0;i<r.length;i++)
	System.out.print(r[i]+" ");
  }
 
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int[] a = new int[5];
  System.out.println("Enter five values: ");
  for(int i =0;i<a.length;i++)
	a[i] = sc.nextInt();
  
  rev(a);
  }
}