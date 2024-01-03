import java.util.Scanner;

public class CalculatePercentage {
    float sub1, sub2, sub3, sub4, sub5, totalMarks;
    float percentage;
    public CalculatePercentage(float sub1, float sub2, float sub3, float sub4, float sub5)
    {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
        totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
    }

    public float returnPercentage()
    {
        return ((totalMarks/500)*100);
    }

    public static void main(String[] args) {
        float sub1, sub2, sub3, sub4, sub5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subject 1 marks: ");
        sub1 = sc.nextFloat();
        System.out.println("Enter the subject 2 marks: ");
        sub2 = sc.nextFloat();
        System.out.println("Enter the subject 3 marks: ");
        sub3 = sc.nextFloat();
        System.out.println("Enter the subject 4 marks: ");
        sub4 = sc.nextFloat();
        System.out.println("Enter the subject 5 marks: ");
        sub5 = sc.nextFloat();
        sc.close();
        CalculatePercentage calc = new CalculatePercentage(sub1, sub2, sub3, sub4, sub5);
        System.out.println("The percentage is: " + calc.returnPercentage());
    }
}
