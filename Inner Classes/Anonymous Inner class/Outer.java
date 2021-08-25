//Defining a thread by using Anonymous Inner class that implements Runnable

class ThreadDemo1{
   public static void main(String[] args){
      Runnable r  = new Runnable()
      {
         public void run(){
           for(int i = 0;i<10;i++)
	System.out.println("child thread");
         }
       };
      Thread t1 = new Thread(r);
      t1.start();
      for(int i = 0;i<10;i++)
	System.out.println("main thread");
    }
}
     