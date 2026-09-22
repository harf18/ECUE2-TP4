package net.lecnam.ussi2a.tp5;


public class Triangle extends Figure {
    Point pB ;  // sommet B
    Point pC ;  // sommet C

    Triangle(Point pB, Point pC, Point point) {
        super(point);  // initialise le sommet A (hérité)
        this.pB = pB;
        this.pC = pC;// initialise B et C
    }

    double longueurAB(){
        return this.point.retourneDistance(pB);
    }

    double longueurAC(){
        return this.point.retourneDistance(pC);
    }

    double longueurBC(){
        return this.pB.retourneDistance(pC);
    }

    @Override
    double retournePerimetre(){
        return longueurAB() + longueurAC() + longueurBC();
    }

    @Override
    double retourneSurface(){
        double s = retournePerimetre() / 2;
        return Math.sqrt(s * (s-longueurAB()) * (s-longueurAC()) * (s-longueurBC()));
    }


    double retournePlusPetitCote(){
        return Math.min(Math.min(longueurAB(), longueurBC()), longueurAC());
    }

    @Override
    boolean contient(Point m){
        double p = this.retournePerimetre();
        double plusPetitCote = this.retournePlusPetitCote();

        double sommeDistances = m.retourneDistance(this.point)
                + m.retourneDistance(this.pB)
                + m.retourneDistance(this.pC);

        return sommeDistances >= p / 2 && sommeDistances <= p - plusPetitCote;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point initial=" + point +
                ", point B=" + pB +
                ", point C=" + pC +
                ", surface=" + this.retourneSurface() +
                '}';
    }
}
