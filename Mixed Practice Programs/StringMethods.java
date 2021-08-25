import java.util.Scanner;
class First
{
   public static void main(String[] args){
     String name = "Sanket";
     System.out.println(name.length());
     System.out.println(name.toLowerCase());
     System.out.println(name.toUpperCase());
     System.out.println(name.replace('S','C'));
     System.out.println(name.indexOf('k'));
     System.out.println(name.charAt(5));
     System.out.println(name.equals("sanket"));
     System.out.println(name.equalsIgnoreCase("sanket"));
     System.out.println(name.startsWith("et"));
     System.out.println(name.endsWith("ss"));
 }
}