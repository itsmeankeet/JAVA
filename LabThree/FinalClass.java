package LabThree;
final class Person {
    public void display() {
        System.out.println("Hello");
    }
}

class Student extends Person {
    @Override
    public void display() {
        System.out.println("Hello World");
    }
}
public class FinalClass {
   public static void main(String[] args) {
    Person p = new Person();
    p.display();
   }
}


//final class cannot be overrideed