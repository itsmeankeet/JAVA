package LabThree;
class Person {
    public final void sayHello() {
        System.out.println("Hello World");
    }
}

class Student extends Person {
    @Override
    public void display() {
        System.out.println("Hello Wolrd");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();
    }
}
//final method can't be overriden