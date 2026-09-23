package net.lecnam.ussi2a.tp5;

public class Carre extends Rectangle {

    /*Constructeur1*/
    public Carre(double cote, Point p) {
        super(cote, cote, p);
    }

    /*Constructeur2*/
    public Carre(double cote, double x, double y) {
        super(cote, cote, new Point(x,y));
    }

    @Override
    public String toString() {
        return "Carre{" +
                "côtés=" + longueur +
                ", point=" + point +
                '}';
    }

}
