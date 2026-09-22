package net.lecnam.ussi2a.tp5;

public class Triangle extends Figure{

    Point p1, p2, p3;

    Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    double retournePerimetre(){
        return p1.retourneDistance(p2) + p1.retourneDistance(p3) + p3.retourneDistance(p2);
    }

    @Override
    double retourneSurface(){
        double s = this.retournePerimetre()/2;
        return Math.sqrt(s * (s - p1.retourneDistance(p2)) * (s - p1.retourneDistance(p3)) * (s - p3.retourneDistance(p2)));
    }

    @Override
    void translate(double x, double y){
        p1.translate(x, y);
        p2.translate(x, y);
        p3.translate(x, y);
    }

    @Override
    boolean contient(Point p){
        Triangle t1 = new Triangle(p1, p2, p);
        Triangle t2 = new Triangle(p3, p2, p);
        Triangle t3 = new Triangle(p1, p3, p);
        return this.retourneSurface() == t1.retourneSurface() + t2.retourneSurface() + t3.retourneSurface();
    }

}
