package net.lecnam.ussi2a.tp5;

public class RectangleIncline extends Rectangle{

    int angle;

    public RectangleIncline(double x, double y, double largeur, double hauteur, int angle) {
        super(x, y, largeur, hauteur);
        this.angle = angle;
    }
}
