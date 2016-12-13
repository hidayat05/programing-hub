package All;

import javax.swing.*;
import java.awt.*;
import java.net.URI;

/**
 * Created by ptinkosinarmedia on 12/13/16.
 */
public class CanvasExample extends Canvas {
    public void paint(Graphics graphics) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(String.valueOf(URI.create("http://indonesiamap.facts.co/indonesiamapwithflagcolors.png")));
        graphics.drawImage(image, 10, 10, this);
    }

    public static void main(String[] args) {
        CanvasExample m = new CanvasExample();
        JFrame jFrame = new JFrame("Canvas Example");
        jFrame.add(m);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}
