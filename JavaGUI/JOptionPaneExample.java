package JavaGUI;
import javax.swing.*;
public class JOptionPaneExample {

  public static void main(String[] args) {
    /* JOptionPane Java user input example */
    var yesOrNo = JOptionPane.showConfirmDialog(null, "What will it be?");
    if (yesOrNo == 0) {
      JOptionPane.showMessageDialog(null, "You chose yes!");
    }
    if (yesOrNo == 1) { 
      JOptionPane.showMessageDialog(null, "You chose no.");
    }
    if (yesOrNo == 2) { 
      JOptionPane.showMessageDialog(null, "You chose to cancel!");
    }
  }
}