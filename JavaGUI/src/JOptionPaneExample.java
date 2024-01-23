package JOptionPane;
import javax.swing.JOptionPane;
import java.sql.SQLOutput;

public class JOptionPaneExample {
    private static String yourName;
    private static String wifeName;
    public static String getPersonName() {
        String[] wifeName = {"Sarmila", "Pooja", "Binita", "Asmita", "Sabina"};
        String name = (String) JOptionPane.showInputDialog(null, "Enter your name: ", "Wife Searching Material", JOptionPane.QUESTION_MESSAGE);
        return name;
    }

    public static String getWifeName() {
        String[] wifeName = {"Sarmila", "Pooja", "Binita", "Asmita", "Sabina"};
        int randomIndex  = (int)(Math.random()*5);
        return (wifeName[randomIndex]);
    }

    public void check(String yourName, String wifeName) {
//        if(yourName == "Biswas" && wifeName == "Sabina") {
//            System.out.println("Biswas said that 'Sabina is very old looking like suddi'");
//            System.out.println("Biswas is very sad right now");
//        }
//        else {
//            System.out.println("Hello " + yourName + " \nYou are damn lucky\nYour wife is reveled her name is "+ wifeName + "\nHappy Married Life" );
//        }
    }


    public static void main(String[] args) {
        JOptionPaneExample ob = new JOptionPaneExample();
        String yourName = getPersonName();
        String wifeName = getWifeName();
//       check(yourName, wifeName);
        JOptionPane.showMessageDialog(null, "Your name is " + yourName + " and Your wife name is "+ wifeName);
    }
}
