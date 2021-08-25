import static java.lang.System.out;
import java.util.Scanner;
import java.io.*;
class First{
  public static void main(String[] args)throws IOException{
    File f = new File("Sanket");
    out.println(f.exists());  //returns false when run for first time.
    f.mkdir();
    out.println(f.exists());
    f.delete();
  }
}
