package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2,3,1.2,9);
        Rectangle r2 = new Rectangle(2,4,0,0);
        Disque d1 = new Disque(2,new Point(5,2));
        Disque d2 = new Disque(3,new Point(2,1));
        Triangle t1 = new Triangle(new Point(1,3),new Point(3,4),new Point(2,7));
        Triangle t2 = new Triangle(new Point(3,3),new Point(12,3),new Point(4,15));
        RectangleIncline ri1 = new RectangleIncline(r1,12);
        RectangleIncline ri2 = new RectangleIncline(3,4,3,2,50);

        dessin.ajout(r1);
        dessin.ajout(r2);
        dessin.ajout(d1);
        dessin.ajout(d2);
        dessin.ajout(t1);
        dessin.ajout(t2);
        dessin.ajout(ri1);
        dessin.ajout(ri2);

        System.out.println("Surface totale dessins : " + dessin.retourneSurfaceTotale());
        System.out.println("Plus grande figure " + dessin.retournePlusGrand().toString() + "\n avec une surface de : " + dessin.retournePlusGrand().retourneSurface());

//        Point p1 = new Point(7,2);
//        System.out.println("Point contenu dans une figure ? " + dessin.contient(p1));
//        System.out.println("\nTest Exercice 1");
//        Disque d1 = new Disque(3,new Point(1,1));
//        d1.translate(1,1);
//        System.out.println("Surface disque :" + d1.retourneSurface());
//        System.out.println("Perimetre du disque : " + d1.retournePerimetre());
//        System.out.println("Contient un point : " + d1.contient(new Point(1,2)));
//        System.out.println("Méthode to string : "+ d1.toString());
//        System.out.println("\nTest Exercice 4");
//        Point p2 = p1.cloneAndTranslate(5,2);
//        Point p3 = p1.cloneAndTranslate(1,6);
//        Triangle t1 = new Triangle(p1,p2,p3);
//        System.out.println("Surface triangle :" + t1.retourneSurface());
//        System.out.println("Perimetre du triangle : " + t1.retournePerimetre());
//        System.out.println("Contient un point (faux) : " + t1.contient(new Point(1,2)));
//        System.out.println("Contient un point (vrai): " + t1.contient(new Point(5,3)));
//        System.out.println("Méthode to string : "+ t1.toString());


    }


}
