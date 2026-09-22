package net.lecnam.ussi2a.tp5;

import java.util.Arrays;

public class Dessin {

    Figure[] figures = new Figure[100];
    int nbFigures = 0;

    void ajout(Figure figure) {
        if (nbFigures < figures.length) {
            figures[nbFigures] = figure;
            nbFigures++;
        } else {
            System.out.println("Attention : Le dessin est plein (maximum 100 figures).");
        }
    }

    double retourneSurfaceTotale() {
        double total = 0;
        for (int i = 0; i < nbFigures; i++) {
            if (figures[i] != null) {
                total += figures[i].retourneSurface();
            }
        }
        return total;
    }

    double retournePerimetreTotale() {
        double total = 0;
        for (int i = 0; i < nbFigures; i++) {
            if (figures[i] != null) {
                total += figures[i].retournePerimetre();
            }
        }
        return total;
    }

    void translate(double x, double y) {
        for (int i = 0; i < nbFigures; i++) {
            if (figures[i] != null) {
                figures[i].translate(x, y);
            }
        }
    }

    boolean contient(Point p) {
        for (int i = 0; i < nbFigures; i++) {
            if (figures[i] != null && figures[i].contient(p)) {
                return true;
            }
        }
        return false;
    }

    Figure retournePlusGrand() {
        Figure plusGrand = null;
        for (int i = 0; i < nbFigures; i++) {
            Figure fig = figures[i];
            if (fig != null) {
                if (plusGrand == null || plusGrand.retourneSurface() < fig.retourneSurface()) {
                    plusGrand = fig;
                }
            }
        }
        return plusGrand;
    }

    @Override
    public String toString() {
        Figure[] figuresActives = Arrays.copyOf(figures, nbFigures);
        return "Dessin{" +
                "figures=" + Arrays.toString(figuresActives) +
                ", nbFigures=" + nbFigures +
                '}';
    }
}