package net.lecnam.ussi2a.tp5;

public class RectangleIncline extends Rectangle{

    int angle = 0;

    public RectangleIncline(double x, double y, double largeur, double hauteur, int angle) {
        super(x, y, largeur, hauteur);
        this.angle = angle;
    }

    @Override
    public boolean contient(Point point) {
        double a = Math.toRadians(this.angle);
        double dx = point.x - this.x;
        double dy = point.y - this.y;
        double rotx =  dx * Math.cos(a) + dy * Math.sin(a);
        double roty = -dx * Math.sin(a) + dy * Math.cos(a);
        return 0 <= rotx && rotx <= this.hauteur
                && 0 <= roty && roty <= this.largeur;
    }
}
