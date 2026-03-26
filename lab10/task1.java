import javax.swing.*;
import java.awt.*;

public class task1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(50, 50, 100, 60);
        g.drawString("Тіктөртбұрыш", 50, 45);

        g.drawOval(200, 50, 80, 80);
        g.drawString("Шеңбер", 200, 45);

        g.drawLine(50, 150, 200, 150);
        g.drawString("Сызық", 50, 170);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Фигуралар");
        frame.add(new task1());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}