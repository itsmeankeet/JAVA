import java.util.Scanner;
public class TowerOfHonai {
    int count = 0;
    public void Tower(int n, String s, String h, String d)  {
        if(n==1) {
            System.out.println("Moving disc "+ n + " from " + s + "to "+ d);
            count++;
            return;
        }
        Tower(n-1, s, d, h);
        count++;
        System.out.println("Moving disc" +n+ " from "+ s + " to " + d);
        Tower(n-1, h, s, d);
    }
    public int returnCount() {
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks:");
        int a = sc.nextInt();
        TowerOfHonai ob = new TowerOfHonai();
        ob.Tower(a, "source", "helper", "destination");
        System.out.println("The total number of steps required are " + ob.returnCount());
    }
}