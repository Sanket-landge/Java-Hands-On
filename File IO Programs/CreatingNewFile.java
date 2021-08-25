import static java.lang.System.out;
import java.util.Scanner;
import java.io.*;
class First{
  public static void main(String[] args)throws IOException{
    File f = new File("abc.txt");
    out.println(f.exists());  //returns false when run for first time.
    f.createNewFile();
    out.println(f.exists());
  }
}
