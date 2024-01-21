import java.util.Scanner;
class Students {
    private int roll;
    private String name;

    public Students(int roll, String name) {//body of parameterized constructor
        this.roll = roll;
        this.name = name;
    }

    public int returnRoll() {//function to return roll
        return this.roll;
    }

    public String returnName() {//function to return name
        return this.name;
    }
}


public class ParameterizedConstructor {
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