package TextFiled;

import javax.swing.*;
import java.awt.*;

public class MyFrame {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel nameLabel = new JLabel("Enter your name: ");
    JLabel rollNoLabel = new JLabel("Enter your rollNO: ");
    JTextField number1TextField = new JTextField();
    JTextField number2TextField = new JTextField();

    MyFrame() {
        frame.setSize(300, 200); // Adjusted frame size
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        number1TextField.setPreferredSize(new Dimension(150, 20));
        number2TextField.setPreferredSize(new Dimension(150, 20));

        panel.add(nameLabel);
        panel.add(number1TextField);

        panel.add(rollNoLabel);
        panel.add(number2TextField);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
