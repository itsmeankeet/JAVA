import java.util.Scanner;
public class Thala {
    int num, digit1, digit2, digit3, digit4;
    Thala(int value)
    {
        num = value;
        digit1 = num /1000;
        digit2 = (num/100)%10;
        digit3 = (num/10)%10;
        digit4 = (num)%10;
    }

    void check()
    {
        int sum = digit1 + digit2 + digit3 + digit4;
        if(sum == 7)
        {
            System.out.println("The message is clear. Thala for a reason! ");
        }
        else{
            System.out.println("Not a thala message");
        }
    }

    public static void main(String[] args) {

        int number;
        System.out.println("Enter four-digit number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        Thala thala = new Thala(number);
        thala.check();
        sc.close();
    }
}
