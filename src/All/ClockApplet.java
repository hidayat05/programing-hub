package All;

import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ptinkosinarmedia on 12/13/16.
 */
public class ClockApplet extends Applet {
    Thread thread, thread1;

    public void start() {
        thread = new Thread((Runnable) this);
        thread.start();
    }

    public void run() {
        thread1 = Thread.currentThread();
        while (thread1 == thread) {
            repaint();

            try {
                thread1.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

    public void paint(Graphics graphics) {
        Calendar calendar = new GregorianCalendar();
        String hour = String.valueOf(calendar.get(Calendar.HOUR));
        String minute = String.valueOf(calendar.get(Calendar.MINUTE));
        String second = String.valueOf(calendar.get(Calendar.SECOND));

        graphics.drawString(hour + ":" + minute + ":" + second, 300, 300);
    }


}


class ArrayForeach {
    public static void main(String[] args) {
        double[] arrayList = {1.9, 2.0, 3.9, 3.1, 4.0};

        for (Double list : arrayList
                ) {
            System.out.println(list);

        }
    }
}


