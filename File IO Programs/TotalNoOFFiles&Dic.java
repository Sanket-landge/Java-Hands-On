import static java.lang.System.out;
import java.util.Scanner;
import java.io.*;
class First{
  public static void main(String[] args){
    int count = 0 ;
    File f = new File("C:\\Program Files");
    String[]  s = f.list();
    for(String s1:s){
      count++;
      out.println(s1);
    }
    out.println("Total no. of files and directories is: "+count);
  }
}
