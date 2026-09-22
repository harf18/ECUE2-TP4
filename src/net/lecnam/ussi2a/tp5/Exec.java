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

        dessin.ajout(r);
        dessin.ajout(r2);
        dessin.ajout(d);

        System.out.println(dessin.retournePlusGrand());

        d.translate(3,4);

        System.out.println(d.retourneSurface());

        System.out.println(d.retournePerimetre());

        System.out.println(d.contient(p));

        System.out.println(d.toString());

    }


}
