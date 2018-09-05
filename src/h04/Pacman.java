package h04;

import java.applet.Applet;
import java.awt.*;

public class Pacman extends Applet {

    public void init(){
        setSize(800,600);
    }

    public void paint(Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(90,90,150,200,205,360);
        g.fillArc(400,400,150,200,205,310);
        g.setColor(Color.white);
        g.fillRect(350,500,10,10);
        g.fillRect(300,500,10,10);
        g.fillRect(250,500,10,10);
        g.fillRect(200,500,10,10);
        g.fillRect(150,500,10,10);
        g.fillRect(100,500,10,10);
    }
}

