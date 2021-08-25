import java.util.ArrayList;
import java.util.Collections;

public class First{
  public static void main(String[] args){
    ArrayList<Integer> nums = new ArrayList<Integer>();  //create object of arraylist.
    nums.add(12);    //adding items to arraylist.
    nums.add(19);
    nums.add(7);
    nums.add(932);
    nums.add(789);
    nums.add(199);
    System.out.println(nums);


    System.out.println(nums.get(2));  //accessing elements in arraylist, indexing starts from 0.

    nums.set(5,333);   //changing existing element.
    System.out.println(nums);

    nums.remove(3);       //removing element.
    System.out.println(nums);
    
    Collections.sort(nums);    //sorting arraylist.
    System.out.println(nums);

    System.out.println(nums.size());    //size of arraylist.

    for(int i=0;i<nums.size();i++){
       System.out.println(nums.get(i));     //loop through arraylist.
    }

    for(int i: nums){
      System.out.println(i);
    }

  }
}