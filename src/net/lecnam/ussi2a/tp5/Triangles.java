package net.lecnam.ussi2a.tp5;

public class Triangles extends Figure {
    Point point1;
    Point point2;
    Point point3;

    public Triangles(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    double retournePerimetre() {
        double a = point1.retourneDistance(point2);
        double b = point2.retourneDistance(point3);
        double c = point3.retourneDistance(point1);
        return a + b + c;
    }

    @Override
    double retourneSurface() {
        double a = point1.retourneDistance(point2);
        double b = point2.retourneDistance(point3);
        double c = point3.retourneDistance(point1);

        double s = retournePerimetre() / 2.0;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    void translate(double x, double y) {
        this.point1.x += x;
        this.point1.y += y;
        this.point2.x += x;
        this.point2.y += y;
        this.point3.x += x;
        this.point3.y += y;
    }

    @Override
    boolean contient(Point p) {
        double aireTotale = this.retourneSurface();

        Triangles t1 = new Triangles(this.point1, this.point2, p);
        Triangles t2 = new Triangles(this.point2, this.point3, p);
        Triangles t3 = new Triangles(this.point3, this.point1, p);

        double sommeAires = t1.retourneSurface() + t2.retourneSurface() + t3.retourneSurface();
        return Math.abs(aireTotale - sommeAires) < 0;
    }
}