package net.lecnam.ussi2a.tp5;


public class Disque {

    Double rayon;
    Point point;

    Disque(double rayon, Point point) {
        this.rayon = rayon;
        this.point = point;
    }

    void translate(double x, double y){
        this.point.translate(x,y);
    }

    double retourneSurface(){
        return Math.PI * this.rayon * this.rayon;
    }

    double retournePerimetre(){
        return 2 * Math.PI * this.rayon;
    }

    boolean contient(Point point){
        double dx = point.x - this.point.x;
        double dy = point.y - this.point.y;
        return (dx * dx + dy * dy) <= rayon * rayon;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "rayon=" + rayon +
                ", point=" + point +
                ", surface=" + this.retourneSurface() +
                ", perimetre=" + this.retournePerimetre() +
                '}';
    }
}
