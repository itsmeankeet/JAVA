package LabTwo;

import java.util.Scanner;

class Student{
    private int roll;
    private String name;
    public Student(Student obj) {
        this.name = obj.name;
        this.roll = obj.roll;
    }
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void display()
    {
        System.out.println("Your name is:"+name);
        System.out.println("Your roll is:"+roll);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Roll No");
        int roll = sc.nextInt();
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        sc.close();
        Student std = new Student(roll, name);
        Student s = new Student(std);
        System.out.println("From Parameterized Constructor");
        std.display();
        System.out.println("From Copy Constructor");
        s.display();
    }
}
