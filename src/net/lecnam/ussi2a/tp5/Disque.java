package net.lecnam.ussi2a.tp5;


public class Disque extends Figure {

    Double rayon;

    Disque(double rayon, Point point) {
        super(point);
        this.rayon = rayon;
    }

    @Override
    double retourneSurface(){
        return Math.PI * this.rayon * this.rayon;
    }

    @Override
    double retournePerimetre(){
        return 2 * Math.PI * this.rayon;
    }

    @Override
    boolean contient(Point point){
        double dx = point.x - this.point.x;
        double dy = point.y - this.point.y;
        return (dx * dx + dy * dy) <= rayon * rayon;
    }

    @Override
    public String toString() {
        return "Disque{" +
                "rayon=" + rayon +
                ", point=" + point +
                ", surface=" + this.retourneSurface() +
                ", perimetre=" + this.retournePerimetre() +
                '}';
    }
}