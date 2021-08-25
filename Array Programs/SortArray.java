//Program to sort the elemets of Array.

import java.util.Scanner;
class SortArray{
  public static void main(String[] args){
 	int[] a = new int[] {2,55,743,22,98};
                 int temp;
	System.out.println("Original array:");
	for(int i=0;i<a.length;i++)
	      System.out.print(a[i]+"  ");
	System.out.println();
	for(int i =0;i<a.length;i++){
	     for(int j=i+1;j<a.length;j++){
	           if(a[i]>a[j]){
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	           }
                      }
                  }
	System.out.println("Sorted array:");
	for(int i=0;i<a.length;i++)
	      System.out.print(a[i]+"  ");
  }
}