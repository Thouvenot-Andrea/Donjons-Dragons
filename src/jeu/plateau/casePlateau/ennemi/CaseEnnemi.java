package jeu.plateau.casePlateau.ennemi;

import jeu.plateau.casePlateau.Case;

public interface CaseEnnemi extends Case {

    void takeDamage(int damage);

    int getHealth();
}