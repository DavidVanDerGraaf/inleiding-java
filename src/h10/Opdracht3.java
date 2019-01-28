package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    TextField tekst;
    Button reset;
    String dag;
    Label label;
    int maand;

    public void init(){
        setSize (400,300);
        tekst = new TextField("", 5);
        label = new Label("Type het maandnummer en druk op enter");
        tekst.addActionListener(new VakListener());
        dag = "";
        add(label);
        add(tekst);
        reset = new Button("Reset");
        reset.addActionListener( new KnopListener() );
        add(reset);
    }

    public void paint(Graphics g){
        g.drawString(dag, 40,50);
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekst.getText();
            maand = Integer.parseInt( s );
            if ( maand == 1 ) {
                dag = "Januari heeft 31 dagen";
                repaint();
            }
            else {
                if ( maand == 2 ) {
                    dag = "Februari heeft 28 dagen";
                    repaint();
                }
                if ( maand == 3 ) {
                    dag = "Maart heeft 31 dagen";
                    repaint();
                }
                if ( maand == 4) {
                    dag = "April heeft 30 dagen";
                    repaint();
                }
                if ( maand == 5 ) {
                    dag = "Mei heeft 31 dagen";
                    repaint();
                }
                if ( maand == 6 ) {
                    dag = "Juni heeft 30 dagen";
                    repaint();
                }
                if ( maand == 7 ) {
                    dag = "Juli heeft 31 dagen";
                    repaint();
                }
                if ( maand == 8 ) {
                    dag = "Augustus heeft 31 dagen";
                    repaint();
                }
                if ( maand == 9 ) {
                    dag = "September heeft 30 dagen";
                    repaint();
                }
                if ( maand == 10 ) {
                    dag = "Oktober heeft 31 dagen";
                    repaint();
                }
                if ( maand == 11 ) {
                    dag = "November heeft 30 dagen";
                    repaint();
                }
                if ( maand == 12 ) {
                    dag = "December heeft 31 dagen";
                    repaint();
                }
                if (maand <= 0) {
                    dag = "Dit nummer is niet verbonden aan een maand";
                    repaint();
                }
                if (maand >= 13) {
                    dag = "Dit nummer is niet verbonden aan een maand";
                    repaint();
                }
            }
        }
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) { tekst.setText("");
        }
    }
}
