//Program to left shift array elements.

import java.util.Scanner;
class First{
  public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);
 	int[] a = new int[] {1,2,3,4,5};
 	int n = 3; // it determines the rotation.
	System.out.println("Original Array: ");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+"  ");
	System.out.println();
	for(int rep=0;rep<n;rep++){
		int j, first;
		first = a[0];
		for(j=0;j<a.length-1;j++)
			a[j]=a[j+1];
		a[j]=first;
 	}
 	System.out.println("Left Shifted array Array: ");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+"  ");
  }
}