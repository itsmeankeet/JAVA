import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseCoordinatesFrame extends JFrame {

    private JTextField mouseLocationField;
    private JTextField mouseStatusField;

    public MouseCoordinatesFrame() {
        setTitle("Mouse Coordinates");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        mouseLocationField = new JTextField();
        mouseLocationField.setEditable(false);

        mouseStatusField = new JTextField();
        mouseStatusField.setEditable(false);

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(mouseLocationField);
        panel.add(mouseStatusField);

        add(panel);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                updateMouseFields(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                mouseStatusField.setText("Mouse is inside the frame");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseStatusField.setText("Mouse is outside the frame");
                mouseLocationField.setText("Mouse Coordinates: ");
            }
        });
    }

    private void updateMouseFields(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        mouseLocationField.setText("Mouse Coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseCoordinatesFrame frame = new MouseCoordinatesFrame();
            frame.setVisible(true);
        });
    }
}
