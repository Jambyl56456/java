import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task9 extends JPanel implements ActionListener {

    int x = 0;
    Timer timer;

    public task9() {
        // Таймер: әр 50 миллисекунд сайын actionPerformed шақырылады
        timer = new Timer(50, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        x += 5; // жылжу қадамы
        if (x > getWidth()) {
            x = 0; // экраннан шықса қайтадан бастау
        }
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 100, 50, 50); // қозғалатын шеңбер
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task 9 - Animation");
        frame.add(new task9());
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}