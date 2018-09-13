package h06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    double a, b, c, uitkomst;

    public void init(){
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a + b + c)/3;
        uitkomst = uitkomst * 10;
        int uitkomstInt = (int) uitkomst;
        uitkomst = (double) uitkomstInt;
        uitkomst = uitkomst / 10;
    }

    public void paint(Graphics g){
        g.drawString("Het gemiddelde is " + uitkomst, 20, 20);
    }
}
