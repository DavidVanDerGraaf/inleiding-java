package h04;

import java.applet.Applet;
import java.awt.*;

public class VlaggenMast extends Applet {

    public void init(){
    }

    public void paint(Graphics g){
        g.drawRect(50,50,10,230);
        g.drawRect(60,50,200,40);
        g.setColor(Color.red);
        g.fillRect(60,50,200,40);
        g.setColor(Color.black);
        g.drawRect(60,90,200,40);
        g.drawRect(60,130,200,40);
        g.setColor(Color.blue);
        g.fillRect(60,130,200,40);
    }
}
