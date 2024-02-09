package JNewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow implements ActionListener {
    JFrame frame = new JFrame("This is a window");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Click Below Button to visit the Old Page");
    JButton btn = new JButton("Let's Go to the Old Window");

    NewWindow() {
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(Box.createVerticalGlue());
        panel.setPreferredSize(new Dimension(100,100));
        btn.addActionListener(this);

       JPanel contentPanel = new JPanel();
       contentPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
       contentPanel.setLayout(new BoxLayout(contentPanel,BoxLayout.Y_AXIS));
       contentPanel.add(label);
       contentPanel.add(btn);
       panel.add(contentPanel);
       panel.add(Box.createVerticalGlue());
       frame.setSize(300,300);
       frame.add(panel);
       frame.setVisible(true);
    }

   @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn) {
            frame.dispose();
            LaunchPage launchPage = new LaunchPage();
        }
   }
}
