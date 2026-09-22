package net.lecnam.ussi2a.tp5;

public class Dessin {

    private Figure[] figures = new Figure[20];
    private int nombreFigures = 0;

    public boolean ajout(Figure figure) {

        if (nombreFigures >= figures.length) {
            return false;
        }

        figures[nombreFigures] = figure;
        nombreFigures++;

        return true;
    }

    public Figure retournePlusGrand() {

        if (nombreFigures == 0) {
            return null;
        }

        Figure plusGrande = figures[0];

        for (int i = 1; i < nombreFigures; i++) {

            if (figures[i].retourneSurface() > plusGrande.retourneSurface()) {
                plusGrande = figures[i];
            }
        }

        return plusGrande;
    }
    public double retourneSurfaceTotale() {

        double surfaceTotale = 0;

        for (int i = 0; i < nombreFigures; i++) {
            surfaceTotale += figures[i].retourneSurface();
        }

        return surfaceTotale;
    }

    public boolean contient(Point point) {

        for (int i = 0; i < nombreFigures; i++) {
            if (figures[i].contient(point)) {
                return true;
            }
        }

        return false;
    }
}