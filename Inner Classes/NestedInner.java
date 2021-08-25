// Nested inner classes

class A{
    class B{
           class C{
                public void m1(){
                        System.out.println("innermost class method");
                }
            }
      }
}

class NestedInner{
   public static void main(String[] args){
       A a = new A();
       A.B b = a.new B();
       A.B.C c = b.new C();
       c.m1();
   }
}