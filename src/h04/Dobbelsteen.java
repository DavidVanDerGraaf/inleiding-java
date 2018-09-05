package h04;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {

    public void init(){
    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRoundRect(20,20,200,200,90,90);
        g.fillArc(50,50,50,50,90,360);
        g.fillArc(150,50,50,50,90,360);
        g.fillArc(50,150,50,50,90,360);
        g.fillArc(150,150,50,50,90,360);
    }
}
