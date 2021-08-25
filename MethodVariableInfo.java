//Program to print methods and variables information by using Class object.

import static java.lang.System.out;
import java.util.Scanner;
import java.lang.reflect.*;
class Student{
   private String name;
   private int rollNo;
   public String getName(){
      return name;
   }
   public int getRoll(){
      return rollNo;
   }
}
class Test{
  public static void main(String[] args)throws ClassNotFoundException{
      int methodCount = 0;
      int varCount = 0;
      Student s = new Student();
      Class c = Class.forName("Student");
      Method[] m = c.getDeclaredMethods();
      for(Method m1 : m){
         methodCount++;
         out.println(m1.getName());
      }
      out.println("Total no of methods "+methodCount);
      Field[] f = c.getDeclaredFields();
      for(Field f1 : f){
         varCount++;
         out.println(f1.getName());
      }
      out.println("Total no of Variables "+varCount);
   }
}