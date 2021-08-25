//Creating our own immutable class.

import static java.lang.System.out;
import java.util.Scanner;
final class ImmutableDemo{
      private int i;
      ImmutableDemo(int i){
        this.i = i ;
      }
      public ImmutableDemo modify(int i){
          if(this.i==i)
	return this;
          else
	return new ImmutableDemo(i);
      }
       public static void main(String[] args){
         ImmutableDemo t1 = new ImmutableDemo(10);
         ImmutableDemo t2 = t1.modify(100);   //new object will be created
         ImmutableDemo t3 = t1.modify(10);     //same object will be reused
         out.println(t1==t2);     //false
         out.println(t1==t3);     //true
        }
}