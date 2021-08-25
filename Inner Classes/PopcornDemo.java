//Anonymous inner class that extends class

class Popcorn{
    public void taste()
    {
      System.out.println("Salty");
    }
}

class Test{
   public static void main(String[] args){
      Popcorn p = new Popcorn()
      {
         public void taste()
         {
            System.out.println("Spicy");
          }
      };
      p.taste();    //Spicy

       Popcorn p1 = new Popcorn();
       p1.taste();   //Salty

       Popcorn p2 = new Popcorn()
       {
          public void taste()
          {
             System.out.println("Sweet");
          }
        };
       p2.taste();       //Sweet

       System.out.println(p.getClass().getName());   //Test$1
       System.out.println(p1.getClass().getName());      //Popcorn
       System.out.println(p2.getClass().getName());    //Test$2
     }
}