package net.lecnam.ussi2a.tp5;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        // Rectangles
        Rectangle r1 = new Rectangle(2, 3, 1, 1);
        Rectangle r2 = new Rectangle(4, 5, 2, 3);

        // Disques
        Disk d1 = new Disk(5, 5, 3);
        Disk d2 = new Disk(10, 10, 2);

        // Triangles
        Triangle t1 = new Triangle(
                new Point(0, 0),
                new Point(6, 2),
                new Point(0, 3)
        );

        Triangle t2 = new Triangle(
                new Point(5, 5),
                new Point(8, 5),
                new Point(6, 9)
        );

        for (int i = 0; i < 8; i++) {
            dessin.ajout(new Triangle(
                    new Point((int)(Math.random() * 15) + 1, (int)(Math.random() * 15) + 1),
                    new Point((int)(Math.random() * 15) + 1, (int)(Math.random() * 15) + 1),
                    new Point((int)(Math.random() * 15) + 1, (int)(Math.random() * 15) + 1)
            ));
        }

        for (int i = 0; i < 10; i++) {
            dessin.ajout(new RectangleIncline(
                    (int)(Math.random() * 10) + 1,
                    (int)(Math.random() * 10) + 1,
                    (int)(Math.random() * 15) + 1,
                    (int)(Math.random() * 15) + 1,
                    (int)(Math.random() * 360)
            ));
        }

        Carre c1 = new Carre(5, 2, 3);

        dessin.ajout(c1);

        System.out.println(c1);

        // Ajout de toutes les figures
        dessin.ajout(r1);
        dessin.ajout(r2);
        dessin.ajout(d1);
        dessin.ajout(d2);
        dessin.ajout(t1);
        dessin.ajout(t2);

        // Surface totale
        System.out.println("Surface totale : "
                + dessin.retourneSurfaceTotale());

        // Plus grande figure
        System.out.println("Plus grande figure : "
                + dessin.retournePlusGrand());

        // Test du triangle
        System.out.println("Périmètre du triangle t1 : "
                + t1.retournePerimetre());

        System.out.println("Surface du triangle t1 : "
                + t1.retourneSurface());

        // Test de translation
        t1.translate(2, 2);
        System.out.println("Triangle t1 après translation : " + t1);

        // Test d'un point
        Point p = new Point(2, 2);

        System.out.println("Le point " + p
                + " est dans une figure : "
                + dessin.contient(p));


        RectangleIncline r3 = new RectangleIncline(5, 3, 2, 4, 45);

        dessin.ajout(r3);

        System.out.println(r3);

        Point p2 = new Point(2, 5);
        System.out.println("Le point est dans le rectangle incliné : "
                + r3.contient(p2));
    }

}