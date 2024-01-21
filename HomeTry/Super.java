class Person {
    protected int age;
    protected String name;
    public Person() {
        this.age = 0;
        this.name = "unknown";
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("Hello, " + name + "\nYour age is " + age);
    }
};

class Student extends Person {
    protected int roll;
    public Student() {
        super();
        this.roll = 0;
    }

    public Student(int roll, String name, int age) {
        super(age, name);
        this.roll = roll;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Your roll is " + roll);
    }
};
public class Super {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        Student s2 = new Student(6, "Ankit Adhikari", 20);
        s2.display();
        return;
    }
}
