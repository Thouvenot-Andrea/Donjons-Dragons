package jeu.plateau.casePlateau.arme;

import jeu.lancement.Menu;
import jeu.personnages.Personnage;
import jeu.plateau.casePlateau.Case;

public interface CaseArme extends Case {

    int ArmeDamage();

    void interagirAvecJoueur(Personnage personnage, Menu menu);


}