package net.lecnam.ussi2a.tp5;

public abstract class Figure {
    Point point; // attribut commun : toutes les figures ont une position

    Figure(Point point) {
        this.point = point;
    }

    abstract double retourneSurface();
    abstract double retournePerimetre();
    abstract boolean contient(Point point);

    void translate(double x, double y) {
        this.point.translate(x, y);
    }
}
