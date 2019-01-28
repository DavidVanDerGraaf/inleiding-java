package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    TextField tekstvak;
    Button reset;
    String tekst;
    Label label;
    int jaartal;

    public void init(){
        setSize (400,300);
        tekstvak = new TextField("", 5);
        label = new Label("Type een jaartal en druk op enter");
        tekstvak.addActionListener(new VakListener());
        tekst = "";
        add(label);
        add(tekstvak);
        reset = new Button("Reset");
        reset.addActionListener( new KnopListener() );
        add(reset);
    }

    public void paint(Graphics g){
        g.drawString(tekst, 40,50);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) { tekstvak.setText("");
        }
    }
}
