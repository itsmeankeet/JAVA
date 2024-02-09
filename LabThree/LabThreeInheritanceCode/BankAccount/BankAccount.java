package LabThree.LabThreeInheritanceCode.BankAccount;

import java.util.Scanner;

public class BankAccount {
    protected int accountNumber;
    protected String accountHolderName;
    protected String accountHolderAddress;
    protected double currentBalance;

    BankAccount(int accountNumber, String accountHolderName, String accountHolderAddress, double currentBalance) {
        this.accountHolderAddress = accountHolderAddress;
        this.accountHolderName = accountHolderName;
        this.currentBalance = currentBalance;
        this.accountNumber = accountNumber;
    }

    public void displayBalance() {
        System.out.println("Your total balance is " + this.currentBalance);
    }

    public void deposit(int amount) {
        this.currentBalance += amount;
        System.out.println("Total Deposited Amount is: " + amount);
    }

    public void withDraw(double amount) {
        if (this.currentBalance >= amount) {
            this.currentBalance -= amount;
            return;
        }
        System.out.println("Cannot Withdraw:\nInsufficient amount in your bank Account");
    }

    public static void main(String[] args) {
        while (true) {
            String accountName;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your Name: ");
            accountName = scanner.nextLine();
            System.out.println("Enter your Account Number: ");
            int accountNumber = scanner.nextInt();
            System.out.println("Enter your Current Amount: ");
            double currentBalance = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Enter your Address");
            String accountHolderAddress = scanner.nextLine();

            System.out.println("Select your Account type: ");
            System.out.println("1. Saving Account");
            System.out.println("2. Checking Account");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    SavingAmount savingAmount = new SavingAmount(accountName, accountHolderAddress, currentBalance, accountNumber);
                    System.out.println("Press 1 to withdraw amount:\nPress 2 to Deposit Amount:\nPress 3 to calculate intrest\nPress 4 to display Amount");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        System.out.println("Enter the amount to be withdraw: ");
                        double amount = scanner.nextFloat();
                        savingAmount.withDraw(amount);
                    } else if (choice == 2) {
                        System.out.println("Enter the amount to be deposited: ");
                        int amount = scanner.nextInt();
                        savingAmount.deposit(amount);
                    } else if(choice == 3) {
                        System.out.println("Enter the intrest Rate");
                        double intrestRate = scanner.nextFloat();
                        savingAmount.setIntrestRate(intrestRate);
                        savingAmount.addIntrest();
                    }else if(choice == 4) {
                        savingAmount.displayBalance();
                    }
                    break;
                case 2:
                    CheckingAccount checkingAccount = new CheckingAccount(accountName, accountHolderAddress, currentBalance, accountNumber);
                    System.out.println("Enter the Over Draft Limit");
                    double overDraftLimit = scanner.nextFloat();
                    checkingAccount.setOverDraftLimit(overDraftLimit);
                    System.out.println("Press 1 to withdraw amount:\nPress 2 to Deposit Amount\nPress 3 to Show your currentBalance");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        System.out.println("Enter the amount to be withdraw: ");
                        double amount = scanner.nextFloat();
                        checkingAccount.withDraw(amount);
                    } else if (choice == 2) {
                        System.out.println("Enter the amount to be deposited: ");
                        int amount = scanner.nextInt();
                        checkingAccount.deposit(amount);
                    } else if(choice == 3){
                        checkingAccount.displayBalance();
                    } else {
                        System.out.println("Invalid Input");
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            scanner.nextLine();
            String exit = scanner.nextLine();
            if(exit.equals("Yes") || exit.equals("yes") || exit.equals("Y") || exit.equals("y")) {
                System.exit(0);
            }
        }
    }
}
