package h04;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    public void init(){
        setSize(720,323);
    }

    public void paint(Graphics g){
        //line
        g.drawLine(10,20,231,20);
        g.drawString("lijn",101,35);

        //rechthoek
        g.drawRect(10,40,221,101);
        g.drawString("Rechthoek",91,155);

        //afgeronde rechthoek
        g.drawRoundRect(10,160,221,101,30,30);
        g.drawString("Afgeronde Rechthoek", 60,275);

        //gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(240,40,221,101);
        g.setColor(Color.black);
        g.drawOval(240,40,221,101);
        g.drawString("Gevulde rechthoek met ovaal", 271,155);

        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(240,160,221,101);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 301, 275);

        //taartpunt met ovaal er omheen
        g.setColor(Color.magenta);
        g.fillArc(470,30,221,101,0,45);
        g.setColor(Color.black);
        g.drawOval(470,30,221,101);
        g.drawString("Taartpunt met ovaal er omheen", 500,155);

        //cirkel
        g.drawOval(530,160,101,101);
        g.drawString("Cirkel", 566,275);

    }
}
