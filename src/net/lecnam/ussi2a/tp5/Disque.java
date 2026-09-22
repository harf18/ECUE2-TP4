package net.lecnam.ussi2a.tp5;

public class Disque extends Figure {
    Point centre;
    int rayon;

    public Disque(Point centre, int rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    void translate(double x, double y) {
        this.centre.x = x;
        this.centre.y = y;
    }

    @Override
    double retourneSurface() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    @Override
    double retournePerimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    boolean contient(Point p) {
        double dx = p.x - this.centre.x;
        double dy = p.y - this.centre.y;
        return (dx * dx + dy * dy) <= (this.rayon * this.rayon);
    }

    @Override
    public String toString() {
        return "Disque{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }
}