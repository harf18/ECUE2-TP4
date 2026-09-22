package net.lecnam.ussi2a.tp5;

public interface Inclinable {

    double getAngle();
    void pivoter(double degres);

    // 1. Il ne peut pas être déclaré car si l'angle est renseigné dans Rectangle, on risque de remettre à 0

    // 2. Non car on ne lui aura pas implémenter le fait que le carré est Inclinable

    // 3. Il ne sert à rien d'incliner un disque car il restera pareil, cependant un triangle peut être incliné (mais ce serait comme si on lui affectait d'autres points de départ)

}
