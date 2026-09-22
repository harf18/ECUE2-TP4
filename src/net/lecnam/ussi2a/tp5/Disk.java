package net.lecnam.ussi2a.tp5;

public class Disk extends Figure {

    private Point centre;
    private double rayon;

    public Disk(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disk(double x, double y, double rayon) {
        this.centre = new Point(x, y);
        this.rayon = rayon;
    }

    @Override
    public void translate(double x, double y) {
        this.centre.translate(x, y);
    }

    @Override
    public double retourneSurface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double retournePerimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public boolean contient(Point point) {
        return this.centre.distance(point) <= rayon;
    }

    @Override
    public String toString() {
        return "Disque de centre " + centre + " et de rayon " + rayon;
    }
}