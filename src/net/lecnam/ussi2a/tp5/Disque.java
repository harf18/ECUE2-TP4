package net.lecnam.ussi2a.tp5;

public class Disque {

    Point centre;
    double rayon;

    Disque(double rayon, Point centre) {
        this.rayon = rayon;
        this.centre = centre;
    }

    public void translate(double x, double y){
        centre.x += x;
        centre.y += y;
    }

    public double retourneSurface(){
        return Math.PI*Math.pow(rayon,2);
    }

    public double retournePerimetre(){
        return 2*Math.PI*rayon;
    }

    public boolean contient(Point p){
        return (p.retourneDistance(centre) <= rayon);
    }

    @Override
    public String toString(){
        return "Le centre du disque est : " + centre.toString() + ", son rayon est de : " + rayon;
    }
}
