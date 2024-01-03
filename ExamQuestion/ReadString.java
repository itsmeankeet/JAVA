import java.util.Scanner;

public class ReadString
{
    String name;
    public ReadString(String name)
    {
        this.name = name;
    }

    public String returnName()
    {
        return(this.name);
    }
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        sc.close();
        ReadString read = new ReadString(name);
        System.out.println("Your name is: "+read.returnName());
        return;
    }
}