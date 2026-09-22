package net.lecnam.ussi2a.tp5;

public class Triangle extends Figure{
    Point point1;
    Point point2;
    Point point3;

    Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    void translate(double x, double y){
        point1.translate(x,y);
        point2.translate(x,y);
        point3.translate(x,y);
    }

    double longueurCote(Point point1,Point point2){
        // Ecriture plus rapide pour les formules suivantes
        return point1.retourneDistance(point2);
    }

    double retournePerimetre(){
        return longueurCote(point1,point2) + longueurCote(point1,point2) + longueurCote(point2,point3);
    }

    double retourneSurface(){
        double demiPerimetre = retournePerimetre()/2;
        return Math.sqrt(demiPerimetre*(demiPerimetre-longueurCote(point1,point2))*(demiPerimetre-longueurCote(point1,point3))*(demiPerimetre-longueurCote(point2,point3)));
    }

    boolean contient(Point point){
        Triangle triangle1 = new Triangle(point1,point2,point);
        Triangle triangle2 = new Triangle(point1,point3,point);
        Triangle triangle3 = new Triangle(point2,point3,point);
        Triangle triangle4 = new Triangle(point1,point2,point3);
        return (triangle1.retourneSurface()+triangle2.retourneSurface()+triangle3.retourneSurface()==triangle4.retourneSurface());
    }

    @Override
    public String toString(){
        return "Triangle basé sur 3 points :\n" + point1.toString() + "\n"+ point2.toString() + "\n"+ point3.toString();
    }
}
