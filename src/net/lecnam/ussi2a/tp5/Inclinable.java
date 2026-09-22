package net.lecnam.ussi2a.tp5;

public interface Inclinable {

    int getAngle();
    void setAngle(int angle);

    public default void pivoter(double degres) {
        setAngle((int) (getAngle() + degres));
    }


    // 1 - Parce que les variables dans les interfaces sont des constantes et nous voulons pouvoir changer la valeur de l'angle
    // 2 - Oui Carré peut être incliné car il hérite de Rectangle, il faudra faire un constructeur dans la classe carré qui appelle le constructeur de rectangle avec super
    // 3 - Disque non cela ne changerai rien, Triangle oui
}