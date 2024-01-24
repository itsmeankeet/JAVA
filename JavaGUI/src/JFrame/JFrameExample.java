package JFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.jar.JarEntry;

public class JFrameExample {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.WHITE, 3);
        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(400,470);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);//disable maximize
        //frame.setExtendedState(true); makes full screen
        ImageIcon image = new ImageIcon(JFrameExample.class.getResource("notepad.png"));
        frame.setIconImage(image.getImage());


        JLabel label = new JLabel();
        label.setText("Bro, Do you even Code?");
        label.setFont(new Font("MVA", Font.BOLD,20));
        label.setForeground(Color.WHITE);
        label.setIcon(new ImageIcon(JFrameExample.class.getResource("panda.png")));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setIconTextGap(20);
        label.setBorder(border);
        frame.add(label);
        frame.setVisible(true);

    }
}
