import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleDrawer extends JFrame {
    private JPanel canvas;

    public CircleDrawer() {
        setTitle("Circle Drawer");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        canvas = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };
        
        canvas.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                String input = JOptionPane.showInputDialog("Enter the radius of the circle:");
                
                if (input != null && !input.isEmpty()) {
                    try {
                        int radius = Integer.parseInt(input);
                        drawCircle(x, y, radius);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                    }
                }
            }
        });
        
        add(canvas);
        setVisible(true);
    }

    private void drawCircle(int x, int y, int radius) {
        Graphics g = canvas.getGraphics();
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CircleDrawer::new);
    }
}
