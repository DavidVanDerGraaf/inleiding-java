package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    TextField tekstvak;
    Button knop;
    String schermtekst;
    String s;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Print");
        knop.addActionListener( new kl() );
        add(tekstvak);
        add(knop);

        knop = new Button("Reset");
        knop.addActionListener( new KnopListener() );
        add(knop);
        s = "";
        schermtekst = "";
    }

    public void paint(Graphics g) {
        g.drawString("Don't keep me hanging here", 100, 40 );
        g.drawString(schermtekst, 20, 100 );

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText(" ");
        }
    }
    class kl implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            schermtekst = tekstvak.getText();
            repaint();
        }
    }
}

