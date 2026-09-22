package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Arrays;
import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2,3,1.2,9);
        Rectangle r2 = new Rectangle(2,4,0,0);
        Point p = new Point(1,2);
        Disque d = new Disque(p,5);
        Triangles t = new Triangles(new Point(1,2), new Point(4,5), new Point(8,7));

        dessin.ajout(r);
        dessin.ajout(r2);
        dessin.ajout(d);
        dessin.ajout(t);

        System.out.println(dessin.retourneSurfaceTotale());

        System.out.println(dessin.retournePlusGrand());

        System.out.println(dessin.contient(p));

        System.out.println(t.retourneSurface());
        System.out.println(t.retournePerimetre());

    }


}
