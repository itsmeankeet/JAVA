import java.util.Scanner;

public class Factorial {
    public int returnFact(int num) {
        if (num <= 1)
            return 1;
        else
            return (num * returnFact(num - 1));
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial: ");
        num = sc.nextInt();
        Factorial fact = new Factorial();
        System.out.println("The factorial of the number is: " + fact.returnFact(num));
        System.out.println("Program Ending...\n\tAuthor: itsmeankeet");
        sc.close();
        return;
    }
};