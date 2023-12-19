import java.util.Scanner;
public class MultiplicationTable {
    int a;
    int result = 0;
    public MultiplicationTable(int data)
    {
        a = data;
    }
    public void table()
    {
        for(int i = 0; i<=10; i++)
        {
            result = i * a;
            System.out.println(a+ " * "+ i +" = "+ result );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        MultiplicationTable ob = new MultiplicationTable(num);
        ob.table();
        sc.close();
    }
}
