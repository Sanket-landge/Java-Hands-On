import java.util.Scanner;
class First{
  public static void main(String[] args){
 	int[] a = new int[]{1,2,3,4,5,6};
	int n=3;
	System.out.println("Original array: ");
	for(int i =0;i<a.length;i++)
	     System.out.print(a[i]+"  ");
	System.out.println();
	for(int rep=0;rep<n;rep++){
	     int j, last;
	     last = a[a.length-1];
	     for(j=a.length-1;j>0;j--){
		a[j] = a[j-1];
                       }
                       a[j] = last;
                  }
	System.out.println("Right Shifted array: ");
	for(int i =0;i<a.length;i++)
	     System.out.print(a[i]+"  ");
  }
}