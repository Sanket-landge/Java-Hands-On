//Diff between == operator and equals() method

import static java.lang.System.out;
import java.util.Scanner;
class StringDemo1{
    public static void main(String[] args){
        String s1 = new String("Sanket");
        String s2 = new String("Sanket");
        out.println(s1==s2);            //false
        out.println(s1.equals(s2));      //true

       StringBuffer sb1 = new StringBuffer("Sanket");
       StringBuffer sb2 = new StringBuffer("Sanket");
       out.println(sb1==sb2);            //false
       out.println(sb1.equals(sb2));      //false
     }
}