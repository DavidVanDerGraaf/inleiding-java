package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    int input;
    int maxInput;
    int minInput;
    TextField tv;
    Button knop;

    public void init() {
        tv = new TextField("", 20);
        add(tv);
        tv.addActionListener(new TekstvakListener());
        maxInput = 0;
        minInput = 0;
        knop = new Button("Reset");
        knop.addActionListener( new KnopListener() );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Max input: " + maxInput, 50, 50);
        g.drawString("Min input: " + minInput, 50, 70);
    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(tv.getText());
            if (input > maxInput) {
                maxInput = input;
            }

            if (input < minInput) {
                minInput = input;
            }
            repaint();
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) { tv.setText("");
        }
    }
}