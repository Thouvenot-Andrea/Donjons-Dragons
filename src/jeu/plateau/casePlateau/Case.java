package jeu.plateau.casePlateau;

import jeu.lancement.Menu;
import jeu.personnages.Personnage;

public interface Case {
    String afficher();

//    String interagir(Personnage personnage);

    void interagirAvecJoueur(Personnage personnage, Menu menu);
}
