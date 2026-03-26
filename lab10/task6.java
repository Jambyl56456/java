import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task6 extends JPanel implements MouseListener {

    int x = -1, y = -1;

    public task6() {
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (x != -1 && y != -1) {
            g.fillOval(x, y, 6, 6);
            g.drawString("X: " + x + " Y: " + y, 20, 20);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 6");
        frame.add(new task6());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Қалған әдістер міндетті (бірақ бос қалдыруға болады)
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}