import java.util.Scanner;

public class Sum {
    private int num1;
    private int num2;
    public Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int returnSum(){
        return(num1+num2);
    }
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        Sum sum = new Sum(num1, num2);
        System.out.println("The sum is: "+sum.returnSum());
        sc.close();
    }
}
