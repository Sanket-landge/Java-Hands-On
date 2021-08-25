import static java.lang.System.out;
interface A{
   public abstract void m1();
}

interface B{
    public abstract void m1();
}

interface C extends A,B{
}

class Test implements C{
    public void m1(){
        out.println("Hello");
    }
}

class Demo{
    public static void main(String[] args){
      Test t = new Test();
      t.m1();
    }
}