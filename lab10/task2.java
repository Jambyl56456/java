import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task2 extends JPanel implements ActionListener {

    String text = "";

    public task2() {
        JButton button = new JButton("Click");
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        text = "Hello Java";
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(text, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 2");
        frame.add(new task2());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}