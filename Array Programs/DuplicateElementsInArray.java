//Programs to find duplicate items in the Array.

import java.util.Scanner;
class First{
  public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);
 	int[] a = new int[] {1,2,3,8,9,6,3,2,9};
    	System.out.println("Duplicate elements in the array: ");
	for(int i = 0;i<a.length;i++){
	     for(int j=i+1;j<a.length;j++){
	           if(a[i] ==a[j])	
		System.out.print(a[j]+"  ");
	     }
                  }
  }
}