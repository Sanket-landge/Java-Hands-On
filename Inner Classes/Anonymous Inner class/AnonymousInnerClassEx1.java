//Anonymous Inner class that extends a class.

class IceCream{
   public void flavour(){
      System.out.println("Chocolate");
   }
}

class IceCreamDemo{
   public static void main(String[] args){
     IceCream c = new IceCream();                //Here we are creating an object for IceCream class.
     c.flavour();              //Chocolate
 
     IceCream c2 = new IceCream()               //Here we are creating a Anonymous inner class which is child of IceCream 
     {                                                             // class and we are creating an object for that child class.
        public void flavour(){
          System.out.println("Mango");
        }
     };
    c2.flavour();              //Mango

     IceCream c3 = new IceCream()
     {
        public void flavour(){
          System.out.println("Vanilla");
        }
     };
   c3.flavour();

   System.out.println(c.getClass().getName());   //IceCream
   System.out.println(c2.getClass().getName());   //IceCream$1
   System.out.println(c.getClass().getName());   //IceCream$2
 
  }
}  
     