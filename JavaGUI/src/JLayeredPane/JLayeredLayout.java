package JLayeredPane;

import javax.swing.*;
import java.awt.*;

public class JLayeredLayout {
    public static void main(String[] args) {
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.decode("#dadada"));
        label1.setBounds(150,150,200,200);
        JLabel label2 = new JLabel();
        label2.setBackground(Color.decode("#bababa"));
        label2.setBounds(100,100,200,200);
        label2.setOpaque(true);
        JLabel label3 = new JLabel();
        label3.setBackground(Color.decode("#cacaca"));
        label3.setBounds(50,50,200,200);
        label3.setOpaque(true);
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,400,400);
        layeredPane.add(label3, Integer.valueOf(2));
        layeredPane.add(label2, Integer.valueOf(1));
        layeredPane.add(label1,Integer.valueOf(0));
        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
