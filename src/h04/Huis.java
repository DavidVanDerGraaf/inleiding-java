package h04;

import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {

    public void init(){
    }

    public void paint(Graphics g) {
        g.drawRect(120,180,160,110);
        g.drawRect(190, 250,20,40);
        g.drawRect(150,230,20,20);
        g.drawRect(230,230,20,20);
        g.drawLine(160,230,160,250);
        g.drawLine(150,240,170,240);
        g.drawLine(240,230,240,250);
        g.drawLine(230,240,250,240);
        g.drawPolygon(new int []{120, 200, 280}, new int[] {180, 100, 180}, 3);

    }
}
