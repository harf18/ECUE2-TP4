package net.lecnam.ussi2a.tp5;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2,3,1.2,9);
        Rectangle r2 = new Rectangle(2,4,0,0);
        Disque d1 = new Disque(5, new Point(0,0));
        Disque d2 = new Disque(6, new Point(1, 2));

        Point p1 = new Point(1, 1);
        Point p2 = new Point(100, 100);

        dessin.ajout(r1);
        dessin.ajout(r2);
        dessin.ajout(d1);
        dessin.ajout(d2);

        System.out.println("surface total du dessin : " + dessin.retourneSurfaceTotale());
        System.out.println("plus grande figure du dessin : " + dessin.retournePlusGrand());
        System.out.println("le point p1 est il dans le dessin ? : " + dessin.contient(p1));
        System.out.println("le point p2 est il dans le dessin ? : " + dessin.contient(p2));



    }


}