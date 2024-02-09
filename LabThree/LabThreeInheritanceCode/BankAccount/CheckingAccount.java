package LabThree.LabThreeInheritanceCode.BankAccount;

public class CheckingAccount extends BankAccount {
    double overDraftLimit;

    CheckingAccount(String accountHolderName, String accountHolderAddress, double currentBalance, int accountNumber) {
        super(accountNumber, accountHolderName, accountHolderAddress, currentBalance);
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withDraw (double amount) {
        double virtualAccount = currentBalance + overDraftLimit;

        if(amount <= virtualAccount) {
            currentBalance -= amount;
            System.out.println("Amount Withdraw: "+ amount + "\nThank You");
        }
        System.out.println("Insufficient Amount \nThank You");
    }
}
