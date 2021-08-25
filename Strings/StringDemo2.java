import static java.lang.System.out;
import java.util.Scanner;
class StringDemo2{
    public static void main(String[] args){
        String s1= new String("You can't change me");   //two obj will be created 1 in heap and 1 in scp.
        String s2 = new String("You can't change me");   //One object will be created in heap area but in scp the object with                                                                                      //same content is already available.
        out.println(s1==s2);      //false
    
        String s3 = "You can't change me;       //Object with same content is already available in scp so s3 start pointing to 			              			 //that object
        out.println(s1==s3);      //false

        String s4 = "You can't change me";     //Object with same content is already available in scp so s4 start pointing to 			              			 //that object
        out.println(s3==s4);
   
        String s5 = "You can't"+"change me";   //if both values are constant so op will be performed at runtime only. so it is 
				//same as s1.
        out.println(s4==s5);

        String s6 = "You can't";                    //New object will be created in scp and s6 is the ref variable

        String s7 = s6+"change me";            //if there is atleast one variable then op will be performed at runtime so this 			            //variable will be created in heap area.
        out.println(s4==s7);
 
        final String s8 = "You can't";
        String s9 = s8 + "change me";           
        out.println(s4==s9);
     }
}

        
     }
}