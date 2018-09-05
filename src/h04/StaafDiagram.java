package h04;

import java.applet.Applet;
import java.awt.*;

public class StaafDiagram extends Applet {

    public void init(){
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawLine( 500, 100, 500, 600);
        g.drawLine(500, 600, 850, 600);

        g.drawString("Personen", 855, 607);
        g.drawString("Gewicht (KG)", 425, 80);

        g.drawString("100kg", 462, 100);
        g.drawString("  80kg", 462, 200);
        g.drawString("  60kg", 462, 300);
        g.drawString("  40kg", 462, 400);
        g.drawString("  20kg", 462, 500);
        g.drawString("    0kg", 462, 600);

        g.drawString("Valerie", 550, 615);
        g.drawString("Jeroen", 655, 615);
        g.drawString("Hans", 760, 615);

        // 100px = 20kg
        g.setColor(Color.RED);
        g.fillRect(550, 400, 50, 200);

        g.setColor(Color.BLUE);
        g.fillRect(650, 100, 50, 500);

        g.setColor(Color.ORANGE);
        g.fillRect(750, 200, 50, 400);

        g.setColor(Color.decode("#BBBBBB"));
        for(int i = 0; i < 5; i++)
            g.drawLine(500, 100 + 100 * i, 850, 100 + 100 * i);
    }

}
