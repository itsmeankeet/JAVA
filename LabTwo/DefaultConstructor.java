import java.util.Scanner;
class Student {
    private int roll;
    private String name;

    public void setData(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int returnRoll() {
        return this.roll;
    }

    public String returnName() {
        return this.name;
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your roll number:");
        int roll = scanner.nextInt();
        scanner.close();
        Student std = new Student(); // Default Constructor called
        std.setData(roll, name);
        System.out.println("Your name is " + std.returnName());
        System.out.println("Your roll is " + std.returnRoll());
    }
}
