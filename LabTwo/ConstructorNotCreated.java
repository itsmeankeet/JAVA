import java.util.Scanner;
class Students {
    private int roll;
    private String name;

    public Students(int roll, String name) {
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


public class ConstructorNotCreated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your roll number:");
        int roll = scanner.nextInt();
        scanner.close();
        Students std = new Students(roll, name); // Parameterized Constructor is called No default constructor
        System.out.println("Your name is " + std.returnName());
        System.out.println("Your roll is " + std.returnRoll());
    }
}