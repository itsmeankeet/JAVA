import java.util.Scanner;

/**
 * TakeInput
 */
public class TakeInput {

    public static void main(String[] args) {
        System.out.println("Enter the number \n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The number you entered is: " + a);
    }
}