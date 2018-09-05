package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {

    public void init(){
    }

    public void paint(Graphics g){
        g.setColor(Color.darkGray);
        g.fillRoundRect(50,50,100,250,100,100);
        g.setColor(Color.red);
        g.fillOval(75,75,50,50);
        g.setColor(Color.yellow);
        g.fillOval(75,150,50,50);
        g.setColor(Color.green);
        g.fillOval(75,225,50,50);
    }
}