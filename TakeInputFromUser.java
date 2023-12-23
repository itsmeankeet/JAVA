import java.util.Scanner;

public class TakeInputFromUser {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("The enterd number is " + a);
        sc.close();
    }
}