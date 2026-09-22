package net.lecnam.ussi2a.tp5;

public class RectangleIncline extends Rectangle{

    double angle;

    public RectangleIncline(double longueur, double largeur, double x, double y, double angle){
        super(longueur, largeur, x, y);
        this.angle = angle;
    }

    public RectangleIncline(double longueur, double largeur, Point p, double angle){
        super(longueur, largeur, p);
        this.angle = angle;
    }

}
