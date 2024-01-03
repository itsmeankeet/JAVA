import java.util.Scanner;

public class BankAccount {
    int balance;
    int id;
    String name;

    BankAccount(int balance, String name, int id) {
        this.balance = balance;
        this.name = name;
        this.id = id;
    }

    void readAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your balance: ");
        balance = scanner.nextInt();
        System.out.println("Enter your ID: ");
        id = scanner.nextInt();
        scanner.close();
    }

    void depositBalance(int amount) {
        balance += amount;
    }

    void withdrawBalance(int amount) {
        balance -= amount;
        if (balance < 0) {
            System.out.println("Cannot withdraw");
            return;
        }
    }

    String getAccountDetails() {
        return ("Name: " + name + " Amount: " + balance + "Id: " + id);
    }

    public static void main(String[] args) {
        BankAccount ob = new BankAccount(100, "Ram", 1);
        ob.readAccount();
        // ob.getAccountDetails();
        ob.depositBalance(1000);
        ob.withdrawBalance(500);
        System.out.println(ob.getAccountDetails());
    }
}