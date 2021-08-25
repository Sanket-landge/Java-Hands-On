import java.util.Scanner;
class Employee{
   int id;
   String name;
   
   Employee(){
   id = 101;
   name = "none";
  }
   Employee(int x,String n){
    id = x;
    name = n;
  }
}
public class First
{
   public static void main(String[] args){
   Employee e1 = new Employee();
   Employee e2 = new Employee(102,"Sanket landge");
   System.out.println(e1.id+" "+e1.name);
   System.out.println(e2.id+" "+e2.name);
 }
}