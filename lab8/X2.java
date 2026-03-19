import java.awt.*;
import javax.swing.*;

public class X2 extends JFrame {
    X2(String s) {
        super(s);
        setLayout(null);
        setSize(600, 300);
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(300, 300);
    }

    public void paint(Graphics gr) {
        int y;
        int j = 0, k = 0;

        gr.setColor(Color.WHITE);
        gr.fillRect(0, 0, 600, 300);

        gr.setColor(Color.LIGHT_GRAY);
        while (j < 600) { gr.drawLine(j, 0, j, 300); j += 30; }
        while (k < 300) { gr.drawLine(0, k, 600, k); k += 30; }

        gr.setColor(Color.BLACK);
        gr.drawLine(300, 0, 300, 300);
        gr.drawLine(0, 150, 600, 150);
        gr.drawLine(120, 140, 120, 160);
        gr.drawLine(480, 140, 480, 160);
        gr.drawString("0", 305, 165);

        gr.setColor(Color.RED);
        for (double i = -240; i < 240; i++) {
            y = (int)(0.01 * i * i); // Парабола: y = x^2 / 100
            gr.drawLine((int)i + 300, 150 - y, (int)i + 300, 150 - y);
        }

        gr.dispose();
    }
}