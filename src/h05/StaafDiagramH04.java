package h05;

import java.applet.Applet;
import java.awt.*;

public class StaafDiagramH04 extends Applet {
    //declaratie
    Color opvulkleurValerie;
    Color opvulkleurJeroen;
    Color opvulkleurHans;
    Color lijnkleur;
    Color maatlijnen;
    int breedte;
    int hValerie;
    int hJeroen;
    int hHans;
    int yValerie;
    int yJeroen;
    int yHans;

    public void init(){
        setSize(1200,900);

        //initialisatie
        opvulkleurValerie = Color.red;
        opvulkleurJeroen = Color.blue;
        opvulkleurHans = Color.orange;
        lijnkleur = Color.black;
        maatlijnen = Color.decode("#BBBBBB");
        breedte = 50;

        //kg*pixels per kg
        hValerie = 40*5;
        hJeroen = 100*5;
        hHans = 80*5;

        //bepalen startwaarde rectangle
        yValerie = 600 - hValerie;
        yJeroen = 600 - hJeroen;
        yHans = 600 - hHans;


    }

    public void paint(Graphics g){
       //assenstelsel
        g.drawLine(500,100,500,600);
        g.drawLine(500,600,850,600);

        g.drawString("Personen", 855,607);
        g.drawString("Gewicht (KG)",425,80);

        g.drawString("100kg", 462, 100);
        g.drawString("  80kg", 462, 200);
        g.drawString("  60kg", 462, 300);
        g.drawString("  40kg", 462, 400);
        g.drawString("  20kg", 462, 500);
        g.drawString("    0kg", 462, 600);

        g.drawString("Valerie", 550, 615);
        g.drawString("Jeroen", 655, 615);
        g.drawString("Hans", 760, 615);

        // 100px = 20kg
        g.setColor(opvulkleurValerie);
        g.fillRect(550, yValerie, breedte, hValerie);

        g.setColor(opvulkleurJeroen);
        g.fillRect(650, yJeroen, breedte, hJeroen);

        g.setColor(opvulkleurHans);
        g.fillRect(750, yHans, breedte, hHans);

        g.setColor(maatlijnen);
        for(int i = 0; i < 5; i++)
            g.drawLine(500, 100 + 100 * i, 850, 100 + 100 * i);
    }
}
