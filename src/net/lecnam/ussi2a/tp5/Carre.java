package net.lecnam.ussi2a.tp5;


public class Carre extends Figure {

    double longueur;
    Point point;


    Carre(double longueur, Point point) {
        this.longueur = longueur;
        this.point = point;
    }

    Carre(double longueur, double x, double y) {
        this(longueur, new Point(x, y));
    }

    @Override
    double retourneSurface(){
        return this.longueur *this.longueur;
    }

    @Override
    double retournePerimetre(){
        return 4 * this.longueur + this.longueur;
    }

    @Override
    void translate(double x, double y){
        this.point.translate(x,y);
    }

    @Override
    boolean contient(Point point){
        return point.x >= this.point.x
                && point.x <= this.point.x+ longueur
                && point.y >= this.point.y
                && point.y <= this.point.y+longueur;
    }

    @Override
    public boolean equals(Object object){
        Carre carre = (Carre) object;
        return this.point.equals(carre.point)
                && this.longueur == carre.longueur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longeur=" + longueur +
                ", point=" + point +
                ", surface=" + this.retourneSurface() +
                '}';
    }


}
