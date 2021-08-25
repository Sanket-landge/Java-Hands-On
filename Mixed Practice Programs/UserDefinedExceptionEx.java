import static java.lang.System.out;
class TooYoungException extends RuntimeException{
     TooYoungException(String s){
        super(s);
      }
   }
class TooOldException extends RuntimeException{
     TooOldException(String s){
        super(s);
        }
}

class First{
   public static void main(String[] args){
     int age = Integer.parseInt(args[0]);
     if(age>50)
         throw new TooOldException("You are too old");
     else if(age<21)
         throw  new TooYoungException("You are too Young");
     else
         out.println("You will recive match details on your registered mail id soon!!");
   }
}