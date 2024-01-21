package LabThree;

import java.util.Scanner;

class Person {
    protected String name;
    protected String address;
    protected int age;

    public Person() {
        this.name = "unknown";
        this.address = "unknown";
        this.age = 0;
    }

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void display() {
        System.out.println("Name: "+ this.name +"\nAddress: " +this.address + "\nAge: "+ this.age);
    }
}

class Student extends Person {
    private int roll;

    public Student(String name, String address, int age) {
        super(name, address, age);
    }

    public void display(int roll) {
        this.roll = roll;
        System.out.println("Name: "+ this.name +"\nAddress: " +this.address + "\nAge: "+ this.age + "\nRollNo: "+this.roll);
    }

    @Override
    public void display() {
        System.out.println("This display function overrides and overload the function of parent class");
    }
}
public class OverloadingAndOverriding {
    public static void main(String[] args) {
        Student student = new Student("Ankit Adhikari" , "Pokhara", 20);
        student.display();
        System.out.println("Enter your roll");
        Scanner scanner = new Scanner(System.in);
        int roll = scanner.nextInt();
        scanner.close();
        student.display(roll);
    }
}
