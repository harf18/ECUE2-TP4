package net.lecnam.ussi2a.tp5;

public class RectangleIncline extends Rectangle {

    int angle;

    RectangleIncline(double longueur, double largeur, double x, double y, int angle) {
        super(longueur, largeur, new Point(x, y));
        this.angle = angle;
    }

    RectangleIncline(double longueur, double largeur, Point point, int angle) {
        super(longueur, largeur, point);
        this.angle = angle;
    }

}