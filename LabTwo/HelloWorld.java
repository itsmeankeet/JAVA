package LabTwo;

class Student{
    public void display() {
        System.out.println("Hello World from Display");
    }
}

public class HelloWorld {

    public static void main(String[] args) {
        Student std = new Student();
        std.display();
        return;
    }
}