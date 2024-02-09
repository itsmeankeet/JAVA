import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("THis is the eg of JFrame's Grid layout");
        frame.setLayout(new GridLayout(3,3,10,10));
        for (int i = 1; i <= 9; i++) {
            JButton btn1 = new JButton(String.valueOf(i));
            frame.add(btn1);
        }
        frame.setVisible(true);
        frame.setSize(200,200);
        }
}
