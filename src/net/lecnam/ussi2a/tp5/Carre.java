package net.lecnam.ussi2a.tp5;

public class Carre extends Figure{

    int longueur;
    Point point;

    public Carre(int longueur, Point point) {
        this.longueur = longueur;
        this.point = point;
    }

    @Override
    double retourneSurface() {
        return longueur * longueur;
    }

    @Override
    double retournePerimetre() {
        return longueur * longueur;
    }

    @Override
    void translate(double x, double y) {
        this.point.x += x;
        this.point.y += y;
    }

    @Override
    boolean contient(Point p) {
        return p.x >= this.point.x && p.x <= (this.point.x + this.longueur) &&
                p.y >= this.point.y && p.y <= (this.point.y + this.longueur);
    }
}
