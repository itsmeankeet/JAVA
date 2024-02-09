package LabThree.LabThreeInheritanceCode.BankAccount;

class SavingAmount extends BankAccount {
    private double intrestRate;
    SavingAmount(String accountHolderName, String accountHolderAddress, double currentBalance, int accountNumber) {
        super(accountNumber, accountHolderName, accountHolderAddress, currentBalance);
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public void addIntrest() {
        double intrest = this.currentBalance * intrestRate;
        System.out.println("Your total intrest is "+ intrest);
        currentBalance += intrest;
    }
}
