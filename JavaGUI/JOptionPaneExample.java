package JavaGUI;

import javax.swing.JOptionPane;
public  class JOptionPaneExample {
  public static void main(String[] args) {
    String choice[] = {"Yes", "No"};
    JOptionPane.showInputDialog("Enter your name");
    int option = 1;
    while (option == 1) {
      System.out.println(JOptionPane.showInputDialog(null, "Bro, Are you kidding..", "Ask", JOptionPane.WARNING_MESSAGE, null, choice, choice[0]));
    }
  }
}