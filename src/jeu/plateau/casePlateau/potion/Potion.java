package jeu.plateau.casePlateau.potion;

import jeu.plateau.casePlateau.Case;

public interface Potion extends Case{
    String getPotionAleatoire();

    int getPointsDeVie(String potion);
}


