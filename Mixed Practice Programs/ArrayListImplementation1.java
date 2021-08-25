import java.util.ArrayList;
import java.util.Collections;

public class First{
  public static void main(String[] args){
    ArrayList<String> cars = new ArrayList<String>();  //create object of arraylist.
    cars.add("Ferrari");    //adding items to arraylist.
    cars.add("BMW");
    cars.add("Lembo");
    cars.add("Range rover");
    cars.add("Rolce royce");
    cars.add("Aston martin");
    System.out.println(cars);


    System.out.println(cars.get(2));  //accessing elements in arraylist, indexing starts from 0.

    cars.set(5,"Audi");   //changing existing element.
    System.out.println(cars);

    cars.remove(3);       //removing element.
    System.out.println(cars);
    
    Collections.sort(cars);    //sorting arraylist.
    System.out.println(cars);

    System.out.println(cars.size());    //size of arraylist.

    for(int i=0;i<cars.size();i++){
       System.out.println(cars.get(i));     //loop through arraylist.
    }

    for(String i: cars){
      System.out.println(i);
    }

  }
}