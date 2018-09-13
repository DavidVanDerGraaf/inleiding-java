package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    public void init() {
        setSize(300, 75);
    }

    public void paint(Graphics g){
        String text = "Een uur bevat " + (short)(60*60) + " seconden\n" +
                "Een dag bevat " + (60*60*24) + " seconden\n" +
                "Een jaar bevat " + (long)(60*60*24*365.24) + " seconden";
        int y = 10;
        for (String line : text.split("\n"))
            g.drawString(line, 10, y += g.getFontMetrics().getHeight());
    }
}