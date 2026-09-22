package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Arrays;
import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2,3,1.2,9);
        Rectangle r2 = new Rectangle(2,4,0,0);
        Point p = new Point(2,4);
        Disque d = new Disque(p,5);
        Triangles t = new Triangles(new Point(1,2), new Point(4,5), new Point(8,7));
        Triangles t2 = new Triangles(new Point(8,10), new Point(15,17), new Point(25,27));
        Triangles t3 = new Triangles(new Point(38,45), new Point(58,65), new Point(78,85));
        RectangleIncline r3 = new RectangleIncline(2,4,5,7,50);
        RectangleIncline r4 = new RectangleIncline(6,4,10,2,140);


        dessin.ajout(r);
        dessin.ajout(r2);
        dessin.ajout(d);
        dessin.ajout(t);
        dessin.ajout(t2);
        dessin.ajout(t3);
        dessin.ajout(r3);
        dessin.ajout(r4);

        System.out.println(r3.contient(p));

        System.out.println(dessin.retourneSurfaceTotale());

        System.out.println(dessin.retournePlusGrand());

        System.out.println(dessin.contient(p));

        System.out.println(t.retourneSurface());
        System.out.println(t.retournePerimetre());

    }


}
