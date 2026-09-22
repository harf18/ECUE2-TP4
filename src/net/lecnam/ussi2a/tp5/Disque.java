package net.lecnam.ussi2a.tp5;

public class Disque extends Figure {

    Point centre;
    double rayon;

    public Disque(Point p, double r){
        this.centre = p;
        this.rayon = r;
    }

    public Disque(double x, double y, double r){
        this.centre = new Point(x, y);
        this.rayon = r;
    }

    @Override
    void translate(double x, double y){
        this.centre.x += x;
        this.centre.y += y;
    }

    @Override
    double retourneSurface(){
        return Math.PI * this.rayon * this.rayon;
    }

    @Override
    double retournePerimetre(){
        return Math.PI * this.rayon * 2;
    }

    @Override
    boolean contient(Point p){
        double x = this.centre.x - p.x;
        double y = this.centre.y - p.y;
        return this.rayon > Math.sqrt(x*x + y*y);
    }

    public String toString(){
        return "Le disque a son centre en (" + this.centre.x + ";" + this.centre.y + ") et a un rayon de " + this.rayon;
    }

}
