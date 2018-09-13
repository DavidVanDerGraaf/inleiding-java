package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    double a, b, uitkomst;

    public void init(){
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g){
        g.drawString("Jan krijgt €" + uitkomst, 20,20);
        g.drawString("Ali krijgt €" + uitkomst, 20,35);
        g.drawString("Jeanette krijgt €" + uitkomst, 20,50);
        g.drawString("David krijgt €" + uitkomst, 20,65);
    }
}





