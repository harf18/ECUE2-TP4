package net.lecnam.ussi2a.tp5;

public class Triangle extends Figure {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Longueur du côté AB
    private double coteAB() {
        return a.distance(b);
    }

    // Longueur du côté BC
    private double coteBC() {
        return b.distance(c);
    }

    // Longueur du côté CA
    private double coteCA() {
        return c.distance(a);
    }

    @Override
    double retournePerimetre() {
        return coteAB() + coteBC() + coteCA();
    }

    // Demi-périmètre
    private double demiPerimetre() {
        return retournePerimetre() / 2;
    }

    @Override
    double retourneSurface() {
        double s = demiPerimetre();
        double a = coteAB();
        double b = coteBC();
        double c = coteCA();

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    void translate(double x, double y) {
        a.translate(x, y);
        b.translate(x, y);
        c.translate(x, y);
    }

    @Override
    boolean contient(Point point) {

        double perimetre = retournePerimetre();

        double p1 = point.distance(a);
        double p2 = point.distance(b);
        double p3 = point.distance(c);

        double plusPetiteDistance = Math.min(p1, Math.min(p2, p3));

        return plusPetiteDistance <= perimetre;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", surface=" + retourneSurface() +
                '}';
    }
}