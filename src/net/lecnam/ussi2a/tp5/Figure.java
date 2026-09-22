package net.lecnam.ussi2a.tp5;

public abstract class Figure {
    abstract double retourneSurface();
    abstract double retournePerimetre();
    abstract boolean contient(Point point);
    abstract void translate(double x, double y);
    public abstract String toString();
}
