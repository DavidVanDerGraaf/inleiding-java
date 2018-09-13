package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init(){
        a = -100;
        b = 50;
        c = 10;
        uitkomst = a + b + c;
    }

    public void paint(Graphics g){
        g.drawString("En de uitkomst is" + uitkomst, 20,20);
    }
}
