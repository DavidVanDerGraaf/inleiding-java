package h04;

import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawPolygon(new int[]{100, 200, 300}, new int[] {200, 20, 200}, 3);
    }
}

