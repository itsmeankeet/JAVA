package Assignment;

public class SavingAccount extends BankAccount implements Transaction{
    final private double intrestRate;

    public SavingAccount(String accountNumber, double currentBalance, double intrestRate) {
        super(accountNumber,currentBalance);
        this.intrestRate = intrestRate;
    }
    @Override
    public void performMaintenance() {
        System.out.println("Let's fix bugs from SavingAccount's performMaintanence()");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Amount Deposited:");
        this.currentBalance += amount;
    }

    @Override
    public void withDraw(double amount) {
        if(currentBalance < amount) {
            System.out.println("Insufficient Balance: Withdraw of balance Failed");
        }
        else {
            System.out.println("WithDraw Succesed:");
            this.currentBalance -= amount;
        }
    }

    public double applyIntrest(double time) {
        double intrestAmount = (this.currentBalance * time * this.intrestRate)/100;
        System.out.println("Intrest Added: ");
        return (currentBalance+=intrestAmount);
    }
}
