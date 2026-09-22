package net.lecnam.ussi2a.tp5;

public class Rectangle extends Figure implements Inclinable {
    double x, y;
    double largeur, hauteur;
    private int angle = 0;

    public Rectangle(double x, double y, double largeur, double hauteur) {
        this(x, y, largeur, hauteur, 0);
    }

    public Rectangle(double x, double y, double largeur, double hauteur, int angle) {
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.angle = angle;
    }

    @Override
    public int getAngle() {
        return angle;
    }

    @Override
    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    double retourneSurface() {
        return largeur * hauteur;
    }

    @Override
    double retournePerimetre() {
        return 2 * (largeur + hauteur);
    }

    @Override
    void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    boolean contient(Point p) {
        if (angle == 0) {
            return p.x >= this.x && p.x <= (this.x + this.largeur) &&
                    p.y >= this.y && p.y <= (this.y + this.hauteur);
        } else {
            double a = Math.toRadians(this.angle);
            double dx = x - this.x;
            double dy = y - this.y;
            double rotx =  dx * Math.cos(a) + dy * Math.sin(a);
            double roty = -dx * Math.sin(a) + dy * Math.cos(a);
            return 0 <= rotx && rotx <= this.hauteur
                    && 0 <= roty && roty <= this.largeur;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", largeur=" + largeur +
                ", hauteur=" + hauteur +
                ", angle=" + angle +
                '}';
    }
}