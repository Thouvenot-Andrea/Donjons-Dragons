package jeu.plateau.casePlateau.potion;


import jeu.lancement.Menu;
import jeu.personnages.Personnage;
import jeu.plateau.casePlateau.Case;

public interface CasePotion extends Case {
    String getPotionAleatoire();

    int getPointsDeVie();

    void interagirAvecJoueur(Personnage personnage, Menu menu);
}


