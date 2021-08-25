import static java.lang.System.out;
import java.util.Scanner;
class StringBufferMethodDemo{
    public static void main(String[] args){
      StringBuffer sb = new StringBuffer();
      out.println(sb.capacity());    //16
      sb.append("Sanket landge");
     
      out.println(sb.length());       //13

      out.println(sb.charAt(4));     //k

       sb.setCharAt(5,'a');     //Sankat landge
       out.println(sb);

      out.println(sb.insert(7,"anil "));     //Sankat anil landge

      out.println(sb.delete(7,12));         //Sankat landge

      out.println(sb.deleteCharAt(4));      //Sankt landge

      out.println(sb.insert(4,'e'));

     out.println(sb.reverse());
 
     sb.setLength(6);
     out.println(sb.length());

      sb.ensureCapacity(100);
      out.println(sb.capacity());

      sb.trimToSize();
      out.println(sb.capacity());
}
}