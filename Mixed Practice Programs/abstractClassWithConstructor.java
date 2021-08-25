abstract class Person{
    String name;
    int age;
    String address;
    String mobileNo;

    Person(String name, int age, String address, String mobileNo){
    this.name = name;
    this.age = age;
    this.address = address;
    this.mobileNo = mobileNo;
    }
}

class Student extends Person{
    int rollNo;
    Student(String name, int age, String address, String mobileNo, int rollNo){
    super(name, age, address, mobileNo);
    this.rollNo = rollNo;
    }
}

class First{
    public static void main(String[] args){
      Student sanket = new Student("Sanket", 23, "Warud", "7066148782", 133);
      System.out.println(sanket.name);
      System.out.println(sanket.rollNo);
      System.out.println(sanket.age);
      System.out.println(sanket.mobileNo);
      System.out.println(sanket.address);
    }
}