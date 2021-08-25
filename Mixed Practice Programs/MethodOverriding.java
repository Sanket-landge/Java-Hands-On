class Bank{
  public int getRateOfInterest(){
     return 0;
 }
}
 
class Sbi extends Bank{
  public int getRateOfInterest(){
     return 7;
 }
}

class Axis extends Bank{
  public int getRateOfInterest(){
     return 9;
 }
}

public class First{
  public static void main(String[] args){
   Sbi s = new Sbi();
   Axis a = new Axis();
   System.out.println(s.getRateOfInterest());
   System.out.println(a.getRateOfInterest());
 }
}