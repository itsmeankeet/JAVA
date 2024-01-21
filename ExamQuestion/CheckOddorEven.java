import java.util.Scanner;

public class CheckOddorEven {
    public static void main(String[] args) {
        // Initialize an array
        int[] numbers = new int[10];

        // Get 10 elements from the user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Separate even and odd numbers
        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];
        int evenCount = 0, oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenCount++] = number;
            } else {
                oddNumbers[oddCount++] = number;
            }
        }

        // Print the results
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
