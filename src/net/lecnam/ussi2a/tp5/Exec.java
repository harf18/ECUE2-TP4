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

        Disque disque = new Disque(new Point(3,3),5);
        boolean estDans = disque.contient(new Point(2,3));
        System.out.println(disque);
        System.out.printf("est dans disque:%b\n",estDans);


    }


}
