import static java.lang.System.out;
import java.util.Scanner;
class StringStringBufferDemo{
    public static void main(String[] args){
       String s = new String("Sanket ");
       s.concat("Landge");    //here we are not assigning this to any reference variable.
       out.println(s);            //Sanket
 
       //s = s.concat("Landge");      //here we are creating a new variable for newly created object with changes.
       //out.println(s);      //Sanket Landge

       StringBuffer sb = new StringBuffer("Sanket ");
       sb.append("Landge");
       out.println(sb);
    }
}