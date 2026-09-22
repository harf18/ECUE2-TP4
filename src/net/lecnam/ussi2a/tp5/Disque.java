package net.lecnam.ussi2a.tp5;

public class Disque {
    private Point centre;

    private double rayon;


    public Disque(Point centre, int rayon) {
        this.centre =  centre;
        this.rayon = rayon;
    }
    public Disque()
    {
        this(new Point(0,0),1);

    }

    public void translate(double x, double y) {
        centre.translate(x, y);
    }

    public double surfaceDisque()
    {
        return Math.PI* Math.pow(rayon, 2);
    }

    public double Perimetre()
    {
        return 2*Math.PI*rayon;
    }
    public boolean contient(Point point)
    {
        double dx = point.x - this.centre.x;
        double dy = point.y - this.centre.y;

        return (dx*dx + dy*dy) <= (this.rayon*this.rayon);
    }
    @Override
    public String toString()
    {
        return "Disque{" + "centre=" + centre + ", rayon=" + rayon + '}';
    }
}
