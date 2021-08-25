//Defining a thread by using Anonymous Inner class

class ThreadDemo{
   public static void main(String[] args){
      Thread t1 = new Thread()
      {
         public void run(){
           for(int i = 0;i<10;i++)
	System.out.println("child thread");
         }
       };
      t1.start();
      for(int i = 0;i<10;i++)
	System.out.println("main thread");
    }
}
     