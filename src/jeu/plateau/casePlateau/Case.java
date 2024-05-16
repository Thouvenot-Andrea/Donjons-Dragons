package jeu.plateau.casePlateau;

import jeu.lancement.Menu;
import jeu.personnages.Personnage;

public interface Case {
    String afficher();

    String interagir(Personnage hero);

    void interagirAvecJoueur(Personnage personnage, Menu menu);
}
