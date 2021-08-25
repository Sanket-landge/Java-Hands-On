import static java.lang.System.out;
import java.util.Scanner;
class StringMethodDemo{
    public static void main(String[] args){
       String name = new String("Sanket");
       out.println(name.charAt(3));   //k

       name = name.concat(" Landge");  //equivalent to name+" Landge" or name+=" Landge"
       out.println(name);         //Sanket Landge

       out.println(name.equals("SANKET LANDGE"));    //false

       out.println(name.equalsIgnoreCase("SANKET LANDGE"));   //true

       out.println(name.isEmpty());     //false

       out.println(name.length());   //13

       out.println(name.replace('e','a'));    //Sankat Landge

       out.println(name.substring(7));        //Landge

       out.println(name.substring(3,9));    //ket La

      out.println(name.indexOf('e'));          //4

      out.println(name.lastIndexOf('e'));        //12

      out.println(name.toLowerCase());     //sanket landge

      out.println(name.toUpperCase());      //SANKET LANDGE

      name = "     Sanket Landge   ";
      out.println(name.trim());    //Sanket Landge
    }
}
        

       

       
