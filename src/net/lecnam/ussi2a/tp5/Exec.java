package net.lecnam.ussi2a.tp5;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2, 3, 1, 1);
        Rectangle r2 = new Rectangle(4, 5, 2, 3);

        Disk d1 = new Disk(5, 5, 3);
        Disk d2 = new Disk(10, 10, 2);

        dessin.ajout(r1);
        dessin.ajout(r2);
        dessin.ajout(d1);
        dessin.ajout(d2);

        System.out.println("Surface totale : " + dessin.retourneSurfaceTotale());

        System.out.println("Plus grande figure : " + dessin.retournePlusGrand());

        Point p = new Point(3, 3);

        System.out.println("Le point " + p + " est dans une figure : "
                + dessin.contient(p));
    }
}