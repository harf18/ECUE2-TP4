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

        // Test du disque
        Disk d = new Disk(2, 3, 5);

        System.out.println(d);
        System.out.println("Surface : " + d.retourneSurface());
        System.out.println("Périmètre : " + d.retournePerimetre());

        Point p = new Point(4, 3);
        System.out.println("Le point est dans le disque : " + d.contient(p));

        d.translate(2, 1);
        System.out.println("Après translation : " + d);
    }
}