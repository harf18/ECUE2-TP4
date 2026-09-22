package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2,3,1.2,9);
        Rectangle r2 = new Rectangle(2,4,0,0);
        Rectangle r3 = new Rectangle(25,20,14, 5,18);

        dessin.ajout(r);
        dessin.ajout(r2);

        System.out.println(dessin.retournePlusGrand());

        Disque d = new Disque(2, 2, 4);
        d.translate(2, 2);
        System.out.println(d.retourneSurface());
        System.out.println(d.retournePerimetre());
        System.out.println(d.contient(new Point(5, 6)));
        System.out.println(d.toString());

        Triangle t = new Triangle(new Point(1, 4), new Point(20, 5), new Point(0, 10));

        Dessin dess = new Dessin();
        dess.ajout(r);
        dess.ajout(r2);
        dess.ajout(d);
        dess.ajout(t);
        dess.ajout(r3);

        System.out.println(dess.retourneSurfaceTotale());
        System.out.println(dess.retournePlusGrand());
        System.out.println(dess.contient(new Point(4, 7)));

    }


}
