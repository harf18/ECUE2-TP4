package net.lecnam.ussi2a.tp5;

public class Carre extends Rectangle {

    Carre(double cote, Point point) {
        super(cote, cote, point);
    }

    Carre(double cote, double x, double y) {
        super(cote, cote, x, y);
    }

    @Override
    public String toString() {
        return "Carre{" +
                "cote=" + longueur +
                ", point=" + point +
                ", surface=" + retourneSurface() +
                '}';
    }
}