package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {
    int man;
    int vrouw;
    int manStudent;
    int vrouwStudent;
    int totaal;
    Button knop;
    String schermtekst;

    public void init() {
        setSize(400, 300);
        man = 0;
        vrouw = 0;
        manStudent = 0;
        vrouwStudent = 0;
        totaal = 0;

        knop = new Button("Man");
        knop.addActionListener( new man() );
        add(knop);

        knop = new Button("Vrouw");
        knop.addActionListener( new vrouw() );
        add(knop);

        knop = new Button("Mannelijke student");
        knop.addActionListener( new manStudent() );
        add(knop);

        knop = new Button("Vrouwlijke student");
        knop.addActionListener( new vrouwStudent() );
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(""+man, 55, 40 );
        g.drawString(""+vrouw, 105, 40 );
        g.drawString(""+manStudent, 185, 40 );
        g.drawString(""+vrouwStudent, 295, 40 );
        g.drawString("In totaal zijn er: " +totaal, 150, 70);
        totaal++;
    }

    class man implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man++;
            repaint();
        }
    }
    class vrouw implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            vrouw++;
            repaint();
        }
    }
    class manStudent implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            manStudent++;
            repaint();
        }
    }
    class vrouwStudent implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            vrouwStudent++;
            repaint();
        }
    }
}