import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of the two numbers is: "+ sum);
        sc.close();
    }
}
