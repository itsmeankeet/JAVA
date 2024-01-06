import java.util.Scanner;

public class CopyConstructor {
    public String name;

    public CopyConstructor(String name) {
        this.name = name;
    }

    public CopyConstructor(CopyConstructor ob1) {
        this.name = ob1.name;
    }

    public void display()
    {
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        CopyConstructor ob = new CopyConstructor(name); //Parameterized constructor
        CopyConstructor ob1 = new CopyConstructor(ob);  //Copy Constructor
        System.out.println("Calling parameterized constructor: ");
        ob.display();
        System.out.println("Calling Copy Constructor: ");
        ob1.display();
        return;
    }
}
