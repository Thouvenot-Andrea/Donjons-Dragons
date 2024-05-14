package jeu.plateau.casePlateau;

import jeu.personnages.Personnage;

public interface Case {
    String afficher();

    String interagir(Personnage hero);
}
