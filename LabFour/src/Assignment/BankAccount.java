package Assignment;

abstract class BankAccount {
    protected String accountNumber;
    protected  double currentBalance;

    public BankAccount(String accountNumber, double currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }
    public void displayAccountInfo() {
        System.out.println("Your account number is: "+this.accountNumber);
        System.out.println("Your current balance is: "+this.currentBalance);
    }

    public abstract void performMaintenance();
}
