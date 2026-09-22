package net.lecnam.ussi2a.tp5;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2,3,1.2,9);
        Rectangle r2 = new Rectangle(2,4,0,0);
        Disque d = new Disque(5, new Point(0,0));

        dessin.ajout(r);
        dessin.ajout(r2);
        dessin.ajout(d);

        System.out.println(dessin.retournePlusGrand());

    }


}