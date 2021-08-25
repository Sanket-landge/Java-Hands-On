class Person{
     String name;
     int age;
     Person(String name, int age){
      this.name = name ;
      this.age = age ;
     }
}


class Student extends Person{
    int rollNo;
    int marks;
    char division;
    Student(String name, int age, int rollNo, int marks, char division){
       super(name, age);
       this.rollNo = rollNo ;
       this.marks = marks ;
       this.division = division;    
     }
}

class Teacher extends Person{
    String subject;
    int experience;
    Teacher(String name, int age, String subject, int experience){
      super(name, age);
      this.subject = subject ;
      this.experience = experience ;
    }
}


public class First{
   public static void main(String[] args){
    Student s1 = new Student("Sanket landge",23,133,495,'A');
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.rollNo);
    System.out.println(s1.marks);
    System.out.println(s1.division);
    System.out.println();
    Teacher t1 = new Teacher("Durga sir",48,"Java",22);
    System.out.println(t1.name);
    System.out.println(t1.age);
    System.out.println(t1.subject);
    System.out.println(t1.experience);
   }
}