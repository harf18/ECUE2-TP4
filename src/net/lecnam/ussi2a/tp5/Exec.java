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

        System.out.println("\nExercice 1");
        Disque d1 = new Disque(3,new Point(1,1));
        d1.translate(1,1);
        System.out.println("Surface disque :" + d1.retourneSurface());
        System.out.println("Perimetre du disque : " + d1.retournePerimetre());
        System.out.println("Contient un point : " + d1.contient(new Point(1,2)));
        System.out.println("Méthode to string : "+ d1.toString());
    }


}
