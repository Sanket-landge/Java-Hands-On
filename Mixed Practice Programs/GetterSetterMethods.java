import java.util.Scanner;
class Employee{
   int id;
   String name;
   public void setId(int x){
     id = x;
   }
   public void setName(String n){
    name= n;
   }
    public String getName(){
      return name;
   }
   public int getId(){
      return id;
   }
}
public class First
{
   public static void main(String[] args){
   Employee e1 = new Employee();
   e1.setName("Sanket Landge");
   e1.setId(101);
   System.out.println(e1.getId()+" "+e1.getName());
   Employee e2 = new Employee();
   e2.setId(102);
   e2.setName("Rakesh Jain");
   System.out.println(e2.getId()+" "+e2.getName());
 }
}