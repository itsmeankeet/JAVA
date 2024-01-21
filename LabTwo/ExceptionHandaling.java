import java.util.Scanner;

public class ExceptionHandaling {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        num2 = scanner.nextInt();
        
        scanner.close();

        Divide divide = new Divide(num1, num2);

        System.out.println("The quotient is: " + divide.returnQuotient());
        System.out.println("The remainder is: " + divide.returnRemainder());
    }
}

class Divide {
    private int num1;
    private int num2;
    private float quotient;

    public Divide(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float returnQuotient() {
        try {
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
                return 0; 
            }
            quotient = (float) num1 / num2;
        } 
        catch (ArithmeticException e) {
            System.out.println("The error is: " + e);
        }
        finally {
            System.out.println("Finally method is called");
        }
        return quotient;
    }

    public int returnRemainder() {
        if (num2 == 0) {
            System.out.println("Error: Cannot calculate remainder when divisor is zero.");
            return 0;
        }
        return num1 % num2;
    }
}
