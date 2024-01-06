import java.util.Scanner;

public class TypesOfConstructor {
    private int num1;
    private int num2;
    public TypesOfConstructor(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Using the value enterd by user:");
    }

    public TypesOfConstructor() {
        num1 = 10;
        num2 = 30;
        System.out.println("Putting value of num1: "+num1+"and num2: "+num2);	
    }

    public int returnSum() {
        return (num1 + num2	);
    }

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        TypesOfConstructor obj = new TypesOfConstructor(); // Default constructor 
        System.out.println("By using default constructor: \nSum is: "+ obj.returnSum());
        TypesOfConstructor obj2 = new TypesOfConstructor(num1, num2); //Parameteized Constructor
        System.out.println("By using paratmeterized constructor: \nSum is: "+ obj2.returnSum());
        scanner.close();
        return;
    }
}
