package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2,3,1.2,9);
        Rectangle r2 = new Rectangle(2,4,0,0);

        dessin.ajout(r);
        dessin.ajout(r2);

        System.out.println(dessin.retournePlusGrand());

        Disque d = new Disque(2, 2, 4);
        d.translate(2, 2);
        System.out.println(d.retourneSurface());
        System.out.println(d.retournePerimetre());
        System.out.println(d.contient(new Point(5, 6)));
        System.out.println(d.toString());

        Dessin dess = new Dessin();
        dess.ajout(r);
        dess.ajout(r2);
        dess.ajout(d);

        System.out.println(dess.retourneSurfaceTotale());
        System.out.println(dess.retournePlusGrand());
        System.out.println(dess.contient(new Point(4, 7)));

    }


}
