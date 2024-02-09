package Assignment;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account Number of the customer");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter the current Balance: ");
        double currentBalance = scanner.nextDouble();
        System.out.println("Enter the intrest rate: ");
        double intrestRate = scanner.nextDouble();
        SavingAccount savingAccount = new SavingAccount(accountNumber, currentBalance, intrestRate);
        double amount;
        while (true) {
            System.out.println("Enter your choice:\n1. Display Account Info:\n2. Deposit\n3. WithDraw\n4. PerformMaintanence\n5. Exit()\n6. Apply Intrest");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    savingAccount.displayAccountInfo();
                    break;
                case 2:
                    System.out.println("Enter the amount to be Deposited: ");
                    amount = scanner.nextDouble();
                    savingAccount.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount to be withdraw");
                    amount = scanner.nextDouble();
                    savingAccount.withDraw(amount);
                    break;
                case 4:
                    savingAccount.performMaintenance();
                    break;
                case 5:
                    System.out.println("Program Exiting...\n\t See You Soon:)");
                    System.exit(0);
                    break;
                case 6:
                    System.out.println("Enter the time peroid: ");
                    double time = scanner.nextDouble();
                    savingAccount.applyIntrest(time);
                    break;
                default:
                    System.out.println("Invalid Input :)");
            }
        }
    }
}
