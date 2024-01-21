package JavaGUI;
import javax.swing.JOptionPane;
public class Sum {
    public static void main(String[] args) {
        String firstnumber = JOptionPane.showInputDialog("Enter the first number");
        String secondNumber = JOptionPane.showInputDialog("Enter the second number");

        int num1 = Integer.parseInt(firstnumber);
        int num2 = Integer.parseInt(secondNumber);

        int result = num1 + num2;

        JOptionPane.showMessageDialog(null, "The sum is" + result,"Result" ,JOptionPane.INFORMATION_MESSAGE);
    }
}