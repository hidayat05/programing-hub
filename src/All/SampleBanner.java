package All;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by hidayat on 12/12/16.
 */
public class SampleBanner extends Applet implements Runnable {
    String str = "ini namanya Banner";
    Thread thread;
    Boolean b;

    public void init() {
        setBackground(Color.gray);
        setForeground(Color.yellow);
    }

    public void start() {
        thread = new Thread(this);
        b = false;
        thread.start();
    }

    @Override
    public void run() {
        char ch;
        try {
            repaint();
            Thread.sleep(250);
            ch = str.charAt(0);
            str = str.substring(1, str.length());
            str = str + ch;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void paintGrafic(Graphics graphics) {
        graphics.drawRect(1, 1, 300, 150);
        graphics.setColor(Color.yellow);
        graphics.fillRect(1, 1, 300, 150);
        graphics.setColor(Color.RED);
        graphics.drawString(str, 1, 150);
    }
}
