import static java.lang.System.out;
import java.util.Scanner;
import java.io.*;
class FileReaderDemo{
  public static void main(String[] args)throws IOException{
    File f = new File("abc.txt");
    f.createNewFile();
    FileWriter fw = new FileWriter(f);
    fw.write("I am iron man");
    fw.flush();
    
   FileReader fr = new FileReader(f);
   char[] ch = new char[(int)f.length()];    //length method return type is long so we are performing type casting 
   fr.read(ch);                                           //it copies data from the file into char[] ch
   for(char ch1 : ch){ 
      out.print(ch1);
   }
   out.println();
   out.println("*********************");
   FileReader fr1 = new FileReader(f);
   int i = fr1.read();
   while(i != -1){
      out.print((char)i);    //read method returns unicode value so we are type casting it into char
      i = fr1.read();
    }
  }
}
