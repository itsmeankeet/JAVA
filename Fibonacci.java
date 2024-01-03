import java.util.Scanner;

public class Fibonacci {
    int num;

    public Fibonacci(int num) {
        this.num = num;
    }

    public int fibonacciCalculator(int num) {
        if (num <= 1)
            return num;
        else
            return ((fibonacciCalculator(num - 1)) + fibonacciCalculator(num - 2));
    }

    public void display() {
        for (int i = 0; i <= num; i++) {
            System.out.print(fibonacciCalculator(i) + "\t");
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("How many series do you want to display");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        Fibonacci fibonacci = new Fibonacci(num);
        System.out.println("Displaying the fibonacci series...");
        fibonacci.display();
        System.out.println("\nProgram Ending...\n\tAuthor: itsmeankeet");
        sc.close();
        return;
    }
};
