package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    int input;
    int maxInput;
    Button knop;
    TextField tv;

    public void init() {
        tv = new TextField("", 20);
        add(tv);
        tv.addActionListener(new TekstvakListener());
        maxInput = 0;
        knop = new Button("Reset");
        knop.addActionListener( new KnopListener() );
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString("Max input: " + maxInput, 50, 50);
    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(tv.getText());
            if (input > maxInput) {
                maxInput = input;
            }
            repaint();
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) { tv.setText("");
        }
    }
}