package JNewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame("This is a window");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Click Below Button to visit the New Page");
    JButton btn = new JButton("Let's Go to the New Window");

    LaunchPage() {
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(Box.createVerticalGlue()); // Add vertical glue to push content to the center

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());
        contentPanel.add(label);
        contentPanel.add(btn);
        contentPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.addActionListener(this);
        panel.add(contentPanel);
        panel.add(Box.createVerticalGlue());
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn) {
            frame.dispose();
            NewWindow newWindow = new NewWindow();
        }
    }
}
