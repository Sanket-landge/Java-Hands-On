import java.io.*;
import java.util.Scanner;

public class First{
  public static void main(String[] args){
     try{
       int[] nums = {23,45,67};
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       System.out.println(nums[i]);
      }
       catch(Exception e){
        System.out.println("Something went wrong");
      }
  }
}