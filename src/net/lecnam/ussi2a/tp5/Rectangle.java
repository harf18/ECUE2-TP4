package net.lecnam.ussi2a.tp5;

public class Rectangle extends Figure {
    double x, y;
    double largeur, hauteur;

    public Rectangle(double x, double y, double largeur, double hauteur) {
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
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
        return p.x >= this.x && p.x <= (this.x + this.largeur) &&
                p.y >= this.y && p.y <= (this.y + this.hauteur);
    }
}