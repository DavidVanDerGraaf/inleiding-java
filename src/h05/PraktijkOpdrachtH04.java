package h05;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtH04 extends Applet {
    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init(){
        setSize(720,323);
        //initialisatie
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 221;
        hoogte = 101;
    }

    public void paint(Graphics g){
        //lijn
        g.drawLine(10,20,231,20);
        g.drawString("Lijn", 101, 35);

        //rechthoek
        g.drawRect(10,40, breedte, hoogte);
        g.drawString("Rechthoek", 91,155);

        //afgeronde rechthoek
        g.drawRoundRect(10,160,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek", 60, 275);

        //gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(240,40,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(240,40,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",271,155);

        //gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(240,160,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal",301,275);

        //taartpunt met ovaal er omheen
        g.setColor(opvulkleur);
        g.fillArc(470,30,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawOval(470,30,breedte,hoogte);
        g.drawString("Taartpunt met ovaal er omheen",500,155);

        //cirkel
        g.drawOval(530,160,hoogte,hoogte);
        g.drawString("Cirkel",566,275);
    }
}
