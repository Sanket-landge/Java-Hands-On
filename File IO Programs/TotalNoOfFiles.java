import static java.lang.System.out;
import java.util.Scanner;
import java.io.*;
class First{
  public static void main(String[] args){
    int count = 0 ;
    File f = new File("C:\\Program Files");
    String[]  s = f.list();
    for(String s1:s){
      File f1 = new File(f,s1);
      if(f1.isFile()){
        count++;
        out.println(s1);
      }
    }
    out.println("Total no. of files and is: "+count);
  }
}
