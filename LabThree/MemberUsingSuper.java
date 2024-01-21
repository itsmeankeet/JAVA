package LabThree;

import java.util.Scanner;

class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello "+this.name);
    }
}

class Doctor extends Person {
    private int age;

    Doctor(int age, String name) {
        super(name);
        this.age = age;
    }

    void displayHelloAndAge() {
        super.sayHello();
        System.out.println("Your age is "+this.age);
    }
}

public class MemberUsingSuper {
    public static void main(String[] args) {
        String name;
        int age;
        System.out.println("Enter your name and age");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        age = scanner.nextInt();
        scanner.close();
        Doctor ob = new Doctor(age, name);
        ob.sayHello();
        ob.displayHelloAndAge();
    }
    
}